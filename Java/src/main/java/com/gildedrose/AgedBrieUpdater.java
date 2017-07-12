package com.gildedrose;

public class AgedBrieUpdater implements Updater {
	
	@Override
	public void updateSellIn(Item item) {
		item.sellIn--;
	}


	@Override
	public void updateQuality(Item item) {
		item.quality += 1;
		if(item.quality > 50) item.quality = 50;
	}	
}
