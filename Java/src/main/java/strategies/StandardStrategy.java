package strategies;

import com.gildedrose.Item;

public class StandardStrategy implements ItemUpdateStrategy {
	
private Item item;
	
	public StandardStrategy(Item item) {
		this.item = item;
	}

	@Override
	public int getQualityUpdateValue() {
		return item.sellIn < 0 ? -2 : -1;
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
