package com.gildedrose;

public class AgedBrieItemUpdater implements ItemUpdater{

	@Override
	public void update(Item item) {
		// Vorschlag: applies(item) Methode, anstatt Konvention dass Überprüfung in update notwendig
		if (!item.name.equals("Aged Brie")) {
			return;
		}
		if (item.quality < 50) {
			item.quality +=1;
		}
		item.sellIn-=1;
	}

}
