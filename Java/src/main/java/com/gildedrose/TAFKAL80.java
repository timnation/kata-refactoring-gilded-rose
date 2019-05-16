package com.gildedrose;

public class TAFKAL80 implements IRoseItem{
	
	private Item item;
	
	public TAFKAL80(Item item) {
		this.item = item;
	}

	@Override
	public void updateQuality() {
		if (item.sellIn < 0) {
			item.quality = 0;
		} else {
		item.quality = item.quality + 1;
         
         if (item.sellIn < 11) {
        	 item.quality = item.quality + 1;
         }

         if (item.sellIn < 6) {
        	 item.quality = item.quality + 1;
             }
         
         if (item.quality > 50) {
        	 item.quality = 50;
         }
		}
	}

	@Override
	public void updateSellIn() {
		item.sellIn--;		
	}

}
