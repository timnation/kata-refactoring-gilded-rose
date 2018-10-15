package strategies;

import com.gildedrose.Item;

public class AgedBrieStrategy implements ItemUpdateStrategy {
	
private Item item;
	
	public AgedBrieStrategy(Item item) {
		this.item = item;
	}

	@Override
	public int getQualityUpdateValue() {
		return item.sellIn > 0 ? 1: 2;
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
