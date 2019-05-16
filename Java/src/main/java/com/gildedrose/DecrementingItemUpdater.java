package com.gildedrose;

public class DecrementingItemUpdater implements ItemUpdater {

	@Override
	public void update(Item item) {
		item.quality -= 1;
		item.sellIn -= 1;
	}

}
