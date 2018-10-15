package com.gildedrose;

class GildedRose {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (Item item : items) {
			ItemUpdater itemUpdater = UpdaterGenerator.getItemUpdater(item);
			itemUpdater.update(item);
		}
	}
}