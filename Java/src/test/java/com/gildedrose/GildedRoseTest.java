package com.gildedrose;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GildedRoseTest {

    @Test
    public void doTestSomeThing() {
        Item brie = new Item("Aged Brie", 20, 50);
        List<Item> items = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            Item numberedBrie = new Item("Aged Brie", 20, i);
            items.add(numberedBrie);
        }

        Item[] legacyArray = items.toArray(new Item[] {});
        Item[] newArray = items.toArray(new Item[] {});
        
        GildedRose gildedRose = new GildedRose(legacyArray);
        GildedRoseNew gildedRoseNew = new GildedRoseNew(newArray);
        
        gildedRose.updateQuality();
        gildedRoseNew.updateQuality();
       
        for(int i = 0; i <= legacyArray.length; i++) {
        	legacyArray[i].equals(newArray[i]);
        	System.out.println(legacyArray[i] + ":" + newArray[i]);
        }
          
        }

    }

