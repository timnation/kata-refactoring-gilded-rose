package com.gildedrose;

public class ConcertUpdater extends NormalUpdater {

	@Override
	public void updateQuality(Item item) {
		if(item.sellIn > 10)
			item.quality++;
		else if(item.sellIn > 5)
			item.quality += 2;
		else if(item.sellIn >= 0)
			item.quality += 3;
		else
			item.quality = 0;
		if(item.quality > 50) item.quality = 50;
	}
}
