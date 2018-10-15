package com.gildedrose;

public class AgedBrieQualityUpdater implements QualityUpdater {

	@Override
	public void update(Item item) {
		if(item.quality < 50) {
			item.quality+=2;
		}
	}

}
