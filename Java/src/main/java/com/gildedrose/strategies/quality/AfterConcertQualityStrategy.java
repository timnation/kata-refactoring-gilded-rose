package com.gildedrose.strategies.quality;

import com.gildedrose.Item;

public class AfterConcertQualityStrategy implements QualityStrategy {

	@Override
	public void adjustQuality(Item item) {
		if(item.sellIn <= 0) {
			item.quality = 0;
		}
	}
}
