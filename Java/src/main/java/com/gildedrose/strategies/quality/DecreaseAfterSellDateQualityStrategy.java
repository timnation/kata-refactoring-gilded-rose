package com.gildedrose.strategies.quality;

import com.gildedrose.Item;

public class DecreaseAfterSellDateQualityStrategy implements QualityStrategy {

	@Override
	public void adjustQuality(Item item) {
		if(item.quality > 0 && item.sellIn <= 0) {
			item.quality = item.quality - 1;
		}
	}
}
