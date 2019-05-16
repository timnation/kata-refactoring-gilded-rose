package com.gildedrose;

public class ValueChanger {
	public void changeValue(Item item, int upperLimit, int lowerLimit, int sellInFactor, int qualityFactor) {
		
		item.sellIn+=sellInFactor;
		if (item.quality < lowerLimit) {
			item.quality+=qualityFactor;
		}
		
	}

}
