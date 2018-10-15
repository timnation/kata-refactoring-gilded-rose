package strategies;

import com.gildedrose.Item;

public class SulfurasStrategy implements ItemUpdateStrategy {
	
	private Item item;
	
	public SulfurasStrategy(Item item) {
		this.item = item;
	}

	@Override
	public int getQualityUpdateValue() {
		return 0;
		
	}

	@Override
	public int getSellInUpdateValue() {
		return 0;
	}

	@Override
	public Item getItem() {
		return item;
	}

	@Override
	public int getMaxQuality() {
		return 80;
	}
	
	

}
