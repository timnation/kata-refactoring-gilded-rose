package com.gildedrose;

public class NormalUpdater implements Updater {

	@Override
	public void updateSellIn(Item item) {
		item.sellIn--;
	}

	@Override
	public void updateQuality(Item item) {
		item.quality--;
		if(item.quality > 50) item.quality = 50;
	}
	
}
