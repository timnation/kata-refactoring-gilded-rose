package com.gildedrose;

public class BackstagePassStrategy implements UpdateStrategy {

	@Override
	public boolean isRelevant(Item item) {
		return true;
	}

	@Override
	public int calculateChange(Item item) {
		if (item.sellIn < 0) {
			return -item.quality;
		}

		if (item.sellIn < 5) {
			return 3;
		}
		
		if (item.sellIn < 10) {
			return 2;
		}
		
		return 1;
	}

}
