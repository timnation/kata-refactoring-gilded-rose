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

        GildedRose gildedRose = new GildedRose(items.toArray(new Item[]{}));

        for (int i = 0; i < 22; i++) {
            gildedRose.updateQuality();
            items.stream().map(Item::toString).forEach(System.out::println);
        }


    }
}
