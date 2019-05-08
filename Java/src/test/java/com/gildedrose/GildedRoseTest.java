package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class GildedRoseTest {
	
	private static final int MIN_QUALITY = -20;
	private static final int MAX_QUALITY = 100;
	
	private static final int MIN_SELLIN = -20;
	private static final int MAX_SELLIN = 100;
	
    private GildedRose legacyRose;
    private GildedRose newRose;


    private void setUpRoses(String name) {
    	List<Item> itemsLegacy = new ArrayList<Item>();
    	for (int i = MIN_QUALITY; i < MAX_QUALITY; i++) {
    		for (int j = MIN_SELLIN; j < MAX_SELLIN; j++) {
				Item item = new Item(name, j, i);
				itemsLegacy.add(item);
			}
    	}
    	
    	List<Item> itemsNew = new ArrayList<>(itemsLegacy);
    	
    	legacyRose = new GildedRose(itemsLegacy.toArray(new Item[]{}));
    	newRose = new GildedRose(itemsNew.toArray(new Item[]{}));
    }
    
    @Test
    public void sulfuras_test() {
    	setUpRoses("Sulfuras, Hand of Ragnaros");
    	
    	for (int i = 0; i < 50; i++) {
    		legacyRose.updateQuality();
    		newRose.updateQualityNew();
		}
    	assertArrayEquals(legacyRose.items, newRose.items);   	
    }
}
