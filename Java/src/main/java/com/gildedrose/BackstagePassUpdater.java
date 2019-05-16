package com.gildedrose;

public class BackstagePassUpdater implements ItemUpdater{

	@Override
	public void update(Item item) {
		// Vorschlag: applies(item) Methode, anstatt Konvention dass Überprüfung in update notwendig
		if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			return;
		}
		item.quality += 1; 
		if (item.sellIn <= 10) {
			item.quality += 1;
		}
		if (item.sellIn <= 5) {
			item.quality += 1;
		}
		if (item.sellIn <= 0) {
			item.quality = 0;
		}
		item.sellIn-=1;
	}

}
