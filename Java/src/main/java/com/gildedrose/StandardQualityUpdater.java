package com.gildedrose;

public class StandardQualityUpdater implements QualityUpdater {

	@Override
	public void update(Item item) {
		
		item.quality--;
		if(item.sellIn < 0 ) {
			item.quality--;
		}
		
		if(item.quality<0) {
			item.quality=0;
		}
	}

}
