package com.gildedrose;

import strategies.ItemUpdateStrategy;
import strategies.Strategy;

class GildedRose {
  
	Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
    	
        for (int i = 0; i < items.length; i++) {
        	ItemUpdateStrategy strategy = Strategy.getInstance(items[i]);
        	strategy.updateItem();
        }
        	
    }

}