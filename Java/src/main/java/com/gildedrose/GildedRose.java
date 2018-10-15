package com.gildedrose;

import java.util.ArrayList;
import java.util.List;

class GildedRose {
	Item[] items;
	List<ItemStrategyWrapper> itemStrategyWrappers;

	private static final int MIN_QUALITY = 0;
	private static final int MAX_QUALITY = 50;

	public GildedRose(Item[] items) {
		this.items = items;
		itemStrategyWrappers = new ArrayList<>();
		addStrategiesToItems();
	}

	private void addStrategiesToItems() {
		for (final Item item : items) {
			ItemStrategyWrapper wrapper = new ItemStrategyWrapper();
			wrapper.setItem(item);
			
			if ("Aged Brie".equalsIgnoreCase(item.name)) {
				wrapper.getStrategies().add(new AgedBrieStrategy());
				wrapper.getStrategies().add(new DatePassedStrategy());
			} else if ("Backstage passes to a TAFKAL80ETC concert".equalsIgnoreCase(item.name)) {
				wrapper.getStrategies().add(new BackstagePassStrategy());
			} else if ("Conjured".equalsIgnoreCase(item.name)) {
				// apply the strategy DatePassed twice when 'Conjured'
				wrapper.getStrategies().add(new DatePassedStrategy());
				wrapper.getStrategies().add(new DatePassedStrategy());
			}
			
			itemStrategyWrappers.add(wrapper);
		}
	}

	public void dailyUpdate() {
		for (final ItemStrategyWrapper itemStrategyWrapper : itemStrategyWrappers) {
			updateSellIn(itemStrategyWrapper);
			updateQuality(itemStrategyWrapper);
		}
	}

	private void updateSellIn(ItemStrategyWrapper itemStrategyWrapper) {
		itemStrategyWrapper.getItem().sellIn--;
	}

	private void updateQuality(ItemStrategyWrapper itemStrategyWrapper) {
		final Item item = itemStrategyWrapper.getItem();

		for (final UpdateStrategy updateStrategy : itemStrategyWrapper.getStrategies()) {
			if (!updateStrategy.isRelevant(item))
				continue;

			int change = updateStrategy.calculateChange(item);
			setQualityForItem(item, change);
		}
	}
	
	private void setQualityForItem(final Item item, final int change) {
		item.quality += change;

		if (item.quality < MIN_QUALITY)
			item.quality = MIN_QUALITY;

		if (item.quality > MAX_QUALITY)
			item.quality = MAX_QUALITY;
	}
}