package com.gildedrose;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//open closed prinzip verletzt: wenn neues item dazu kommt, braucht man neue if else zweige und name.equals prüfungen
//

// Review comments:
// - Unklar, wieso es Updater und Rules gibt
// + Open Closed ist jetzt erfüllt: Hinzufügen von neuem Updater oder Rule möglich
// Vorschlag: applies(item) Methode, anstatt Konvention dass Überprüfung in update notwendig

class GildedRose {
    Item[] items;
    List<ItemUpdater> updaters = new ArrayList<>();
    Map <String, ItemRule> itemsToRules = new HashMap<>();

        public GildedRose(Item[] items) {
        this.items = items;
//        updaters.add(new DecrementingItemUpdater());
//        updaters.add(new SulfurasItemUpdater());
//        updaters.add(new BackstagePassUpdater());
//        updaters.add(new AgedBrieItemUpdater());
          itemsToRules.put("Backstage passes to a TAFKAL80ETC concert", 
        		  new CompositeRule(Arrays.asList(new DecrementSellInRule())));
        }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
        	Item item = items[i];
        	updaters.forEach(updater -> updater.update(item));
        	itemsToRules.get(item.name).apply(item);
            
        }
    }
}