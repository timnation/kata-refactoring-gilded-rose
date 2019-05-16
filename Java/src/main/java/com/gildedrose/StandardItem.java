package com.gildedrose;

public class StandardItem implements IRoseItem{
	
	private Item item;
	
	public StandardItem(Item item) {
		this.item = item;
	}
	
	@Override
	public void updateQuality() {
		if(item.quality > 0)
		item.quality--;
	}

	@Override
	public void updateSellIn() {
		item.sellIn--;
	}

}
