package strategies;

import com.gildedrose.Item;

public class BackstagePassesStrategy implements ItemUpdateStrategy {
	
private Item item;
	
	public BackstagePassesStrategy(Item item) {
		this.item = item;
	}

	@Override
	public int getQualityUpdateValue() {
		 if (sellInLessThenFiveDays()) {
             return 3;
		 }
            
         if (sellInInLessThenTenDays()) {
             return 2;
         }      
		return 1;
	}

	private boolean sellInInLessThenTenDays() {
		return item.sellIn < 11;
	}

	private boolean sellInLessThenFiveDays() {
		return item.sellIn < 6;
	}

	@Override
	public int getSellInUpdateValue() {
		return -1;
		
	}
	
	@Override
	public Item getItem() {
		return item;
	}

}
