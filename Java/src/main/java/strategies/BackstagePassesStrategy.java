package strategies;

import com.gildedrose.Item;

public class BackstagePassesStrategy implements ItemUpdateStrategy {
	
private Item item;
	
	public BackstagePassesStrategy(Item item) {
		this.item = item;
	}

	@Override
	public int getQualityUpdateValue() {
		 if (item.sellIn < 6) {
             return 3;
		 }
            
         if (item.sellIn < 11) {
             return 2;
         }      
		return item.sellIn < 0 ? -item.quality : 1;
	}

	@Override
	public int getSellInUpdateValue() {
		return -1;
		
	}
	
	@Override
	public Item getItem() {
		return item;
	}

	@Override
	public int getMaxQuality() {
		return 50;
	}

}
