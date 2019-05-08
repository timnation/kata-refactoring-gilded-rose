package com.gildedrose;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void doTestSomeThing() {
    	String[] names = {"Aged Brie","Backstage passes to a TAFKAL80ETC concert","Sulfuras, Hand of Ragnaros"}; 
    	

    	
    	
        List<Item> items = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
   
// 
            items.add(numberedBrie);
        }

        Item[] legacyArray = items.toArray(new Item[] {});
        Item[] newArray = items.toArray(new Item[] {});
        
        GildedRose gildedRose = new GildedRose(legacyArray);
        GildedRoseNew gildedRoseNew = new GildedRoseNew(newArray);
        
        gildedRose.updateQuality();
        gildedRoseNew.updateQuality();
       
        for(int i = 0; i <= legacyArray.length -1; i++) {
        	boolean equals = legacyArray[i].equals(newArray[i]);
        	
        	System.out.println(legacyArray[i] + " : " + newArray[i]+ " : " + equals);
        }
          
        }

    }

