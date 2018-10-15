package com.gildedrose;

public class StandardSellInUpdater implements SellInUpdater {

	@Override
	public void update(Item item) {
		item.sellIn--;
	}

}
