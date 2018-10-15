package com.gildedrose.strategies.quality;

import com.gildedrose.Item;

public class IncreaseQualityStrategy implements QualityStrategy {

	@Override
	public void adjustQuality(Item item) {
		if(item.quality < 50) {
			item.quality = item.quality + 1;
		}
	}
}