package com.gildedrose.strategies.quality;

import com.gildedrose.Item;

public class IncreaseAfterSellDateQualityStrategy implements QualityStrategy {

	@Override
	public void adjustQuality(Item item) {
		if(item.quality < 50 && item.sellIn <= 0) {
			item.quality = item.quality + 1;
		}
	}
}