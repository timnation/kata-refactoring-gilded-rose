package strategies;

import com.gildedrose.Item;

public class Strategy {
	
	private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	private static final String AGED_BRIE = "Aged Brie";
	private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
	
	static public ItemUpdateStrategy getInstance(Item item) {
		ItemUpdateStrategy strategy;
		
		switch (item.name) {
			case SULFURAS : strategy = new SulfurasStrategy(item); break;
		
			case AGED_BRIE : strategy = new AgedBrieStrategy(item); break;
		
			case BACKSTAGE_PASSES : strategy = new BackstagePassesStrategy(item); break;
		
			default : strategy = new StandardStrategy(item); break;
		}
		return strategy;
	}

}
