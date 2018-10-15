package com.gildedrose;

public class UpdaterGenerator {
	public static ItemUpdater getItemUpdater(Item item) {
		String name = item.name;
		if(name.equals("Aged Brie")) {
			return new ItemUpdater(new AgedBrieQualityUpdater(), new StandardSellInUpdater());
		}else if(name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			return new ItemUpdater(new BackstagPassQualityUpdater(), new StandardSellInUpdater());
		}else if(name.equals("Sulfuras, Hand of Ragnaros")) {
			return new ItemUpdater(new SulfurasQualityUpdater(), new SulfurasSellInUpdater());
		}else {
			return new ItemUpdater(new StandardQualityUpdater(), new StandardSellInUpdater());
		}
	}
	
	
}
