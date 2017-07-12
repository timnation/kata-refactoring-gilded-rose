package com.gildedrose;

class GildedRose {
    Item[] items;
    
    UpdaterFactory factory = new UpdaterFactory();

    public GildedRose(Item[] items) {
        this.items = items;
    }
    
    public void updateQuality() {
    	for(Item item : items) {
    		Updater updater = factory.getUpdater(item);
    		updater.updateSellIn(item);
    		updater.updateQuality(item);
    	}
    }
}