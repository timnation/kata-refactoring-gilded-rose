package com.gildedrose;

public class ItemUpdater {
	public void update(IRoseItem item) {
		item.updateQuality();
		item.updateSellIn();
	}

}
