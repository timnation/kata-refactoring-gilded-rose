package strategies;

import com.gildedrose.Item;

public interface ItemUpdateStrategy {
	
	final static int MIN_QUALITY = 0;
		
	public int getQualityUpdateValue();
	
	public int getSellInUpdateValue();
		
	public Item getItem();
	
	public int getMaxQuality();
	
	public default void updateItem() {
		getItem().sellIn += getSellInUpdateValue();
		int updateQualityValue = getQualityUpdateValue();
		if (getItem().quality + updateQualityValue > getMaxQuality()) {
			getItem().quality = getMaxQuality();
		} else if(getItem().quality + updateQualityValue < MIN_QUALITY) {
			getItem().quality = MIN_QUALITY;
		} else {
			getItem().quality = updateQualityValue;
		}
	}

	
}
