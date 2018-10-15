package com.gildedrose.strategies.quality;

import com.gildedrose.Item;

public class BeforeConcertQualityStrategy implements QualityStrategy {
	
	private int daysBeforeConcert;

	public BeforeConcertQualityStrategy(int daysBeforeConcert) {
		this.daysBeforeConcert = daysBeforeConcert;
	}

	@Override
	public void adjustQuality(Item item) {
		if (item.quality < 50 && item.sellIn < (daysBeforeConcert + 1)) {
			item.quality = item.quality + 1;
		}
	}
}
