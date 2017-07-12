package com.gildedrose;

public class UpdaterFactory {
	
	
	public Updater getUpdater(Item item) {
		Updater updater;
		
		switch (item.name) {
		case "Aged Brie":
			updater = new AgedBrieUpdater();
			break;
		case "Sulfuras, Hand of Ragnaros":
			updater = new SulfurasUpdater();
			break;
		case "Backstage passes to a TAFKAL80ETC concert":
			updater = new ConcertUpdater();
			break;
		case "Conjured":
			updater = new ConjuredUpdater();
			break;
		default:
			updater = new NormalUpdater();
		}
		return updater;
	}
}
