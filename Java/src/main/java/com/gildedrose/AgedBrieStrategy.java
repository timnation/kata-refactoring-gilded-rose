package com.gildedrose;

public class AgedBrieStrategy implements UpdateStrategy {

	@Override
	public boolean isRelevant(Item item) {
		return item.sellIn >= 0;
	}

	@Override
	public int calculateChange(Item item) {
		return 1;
	}

}
