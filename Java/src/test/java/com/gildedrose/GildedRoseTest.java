package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GildedRoseTest {
	
    @Test
    public void goldenMasterTest() {
    	List<String> names = Arrays.asList("Aged Brie", "Alex", "Sulfuras, Hand of Ragnaros", 
    			"Backstage passes to a TAFKAL80ETC concert", "");
    	
        List<Item> itemsOriginal = createTestData(names, -1, 100, -1, 15);
        List<Item> itemsRefactored = createTestData(names, -1, 100, -1, 15);

        GildedRose gildedRose = new GildedRose(itemsOriginal.toArray(new Item[]{}));
        GildedRoseRefactored alexGildedRose = new GildedRoseRefactored(itemsRefactored.toArray(new Item[]{}));

        for (int i = 0; i < 20; i++) {
            gildedRose.updateQuality();
            alexGildedRose.updateQuality();
            
            for (int j = 0; j < itemsOriginal.size(); j++) {
            	assertEquals(itemsOriginal.get(j), itemsRefactored.get(j));
            }
        }
    }

	private List<Item> createTestData(List<String> names, int lowerQuality, int upperQuality, int lowerSellIn, int upperSellIn) {
	    List<Item> items = new ArrayList<>();
	    for (String name : names) {
	    	for (int quality = lowerQuality; quality <= upperQuality; quality++) {
	    		for (int sellIn = lowerSellIn; sellIn <= upperSellIn; sellIn++) {
	    			 Item numberedBrie = new Item(name, quality, sellIn);
	    		        items.add(numberedBrie);
	    		}
	    	}
	    }
		return items;
	}
}
