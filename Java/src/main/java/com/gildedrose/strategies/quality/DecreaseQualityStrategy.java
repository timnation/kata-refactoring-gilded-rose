package com.gildedrose.strategies.quality;

import com.gildedrose.Item;

public class DecreaseQualityStrategy implements QualityStrategy {

	@Override
	public void adjustQuality(Item item) {
		if(item.quality > 0) {
			item.quality = item.quality - 1;
		}
	}
}
