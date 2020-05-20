package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80), //
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20), //
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49), //
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49), //
        };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertItemEquals(items[0], "+5 Dexterity Vest", 9, 19);
        assertItemEquals(items[1], "Aged Brie", 1, 1);
        assertItemEquals(items[2], "Elixir of the Mongoose", 4, 6);
        assertItemEquals(items[3], "Sulfuras, Hand of Ragnaros", 0, 80);
        assertItemEquals(items[4], "Sulfuras, Hand of Ragnaros", -1, 80);
        assertItemEquals(items[5], "Backstage passes to a TAFKAL80ETC concert", 14, 21);
        assertItemEquals(items[6], "Backstage passes to a TAFKAL80ETC concert", 9, 50);
        assertItemEquals(items[7], "Backstage passes to a TAFKAL80ETC concert", 4, 50);

        app.updateQuality();

    }

    private void assertItemEquals(Item item, String nameExpected, int sellInExpected, int qualityExpected) {
        assertEquals(nameExpected, item.name);
        assertEquals(sellInExpected, item.sellIn);
        assertEquals(qualityExpected, item.quality);
    }

}
