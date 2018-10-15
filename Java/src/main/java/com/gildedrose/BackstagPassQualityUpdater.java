package com.gildedrose;

public class BackstagPassQualityUpdater implements QualityUpdater {

	@Override
	public void update(Item item) {
		if(item.sellIn >0) {
			item.quality++;
		}
		if (item.sellIn < 11) {
			if (item.quality < 50) {
				item.quality = item.quality + 1;
			}
		}

		if (item.sellIn < 6) {
			if (item.quality < 50) {
				item.quality = item.quality + 1;
			}
		}
		
		if (item.sellIn < 0) {
			item.quality = 0;
		}
		
	}

}
