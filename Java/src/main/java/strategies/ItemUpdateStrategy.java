package strategies;

import com.gildedrose.Item;

public interface ItemUpdateStrategy {
	
	final static int MAX_QUALITY = 50;
	final static int MIN_QUALITY = 0;
		
	public int getQualityUpdateValue();
	
	public int getSellInUpdateValue();
		
	public Item getItem();
	
	public default void updateItem() {
		getItem().sellIn += getSellInUpdateValue();
		int updateQualityValue = getQualityUpdateValue();
		if (getItem().quality + updateQualityValue > MAX_QUALITY) {
			getItem().quality = MAX_QUALITY;
		} else if(getItem().quality + updateQualityValue < MIN_QUALITY) {
			getItem().quality = MIN_QUALITY;
		} else {
			getItem().quality = updateQualityValue;
		}
	}

	
}
