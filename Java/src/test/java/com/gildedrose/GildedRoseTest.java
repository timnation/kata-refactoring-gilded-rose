package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }
    
    @Test
    public void testAgedBrie() {
    	Item brie = new Item("Aged Brie", 10, 10);
    	GildedRose gildedRose = new GildedRose(new Item[] {brie});
    	gildedRose.updateQuality();
    	assertEquals(11, brie.quality);
    	assertEquals(9, brie.sellIn);
    	
    	gildedRose.updateQuality();
    	assertEquals(12, brie.quality);
    	assertEquals(8, brie.sellIn);
    	
    	for (int i = 0; i < 5; i++) {
    		gildedRose.updateQuality();
    	}
    	assertEquals(17, brie.quality);
    	assertEquals(3, brie.sellIn);
    	
    	for (int i = 0; i < 60; i++) {
    		gildedRose.updateQuality();
    	}

    	assertEquals(50, brie.quality);
    }
    
    @Test
    public void testSulfuras() {
    	Item sulfuras = new Item("Sulfuras, Hand of Ragnaros", 15, 17);
    	GildedRose gildedRose = new GildedRose(new Item[] {sulfuras});
    	
    	for (int i = 0; i < 60; i++) {
    		gildedRose.updateQuality();
    	}

    	assertEquals(15, sulfuras.sellIn);
    	assertEquals(17, sulfuras.quality);
    }
    
    @Test
    public void testBackstagePass() {
    	Item pass = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 17);
    	GildedRose gildedRose = new GildedRose(new Item[] {pass});
    	
    	for (int i = 0; i < 5; i++) {
    		gildedRose.updateQuality();
    	}

    	assertEquals(10, pass.sellIn);
    	assertEquals(22, pass.quality);
    	    	
    	for (int i = 0; i < 5; i++) {
    		gildedRose.updateQuality();
    	}
    	
    	assertEquals(5, pass.sellIn);
    	assertEquals(32, pass.quality);
    	
    	gildedRose.updateQuality();
    	
    	assertEquals(4, pass.sellIn);
    	assertEquals(35, pass.quality);
    	
    	for (int i = 0; i < 5; i++) {
    		gildedRose.updateQuality();
    	}
    	
    	assertEquals(-1, pass.sellIn);
    	assertEquals(0, pass.quality);
    }
    
    
    

}
