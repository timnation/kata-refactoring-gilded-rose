package com.gildedrose;

public class AgedBrie implements IRoseItem{

	private Item item;
	
	public AgedBrie(Item item) {
		this.item = item;
	}

	@Override
	public void updateQuality() {
		if (item.quality < 50) {
			item.quality++;
		}
	}

	@Override
	public void updateSellIn() {
		item.sellIn--;		
	}
	
	

}
