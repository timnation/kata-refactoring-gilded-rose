package com.gildedrose;

import java.util.Arrays;
import java.util.List;

class GildedRose {

    private final static List<String> ITEMS_WITH_QUALITY_INCREASE = Arrays.asList("Aged Brie",
            "Backstage passes to a TAFKAL80ETC concert");
    private final static List<String> ITEMS_WITH_CONSTANT_QUALITY = Arrays.asList("Sulfuras, Hand of Ragnaros");
    private final static String ITEM_CONCERT_TICKET = "Backstage passes to a TAFKAL80ETC concert";

    private final static int MAX_QUALITY = 50;

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            adaptQuality(item);
            adaptSellIn(item);
            adaptQualityBonusRound(item);
        }
    }

    private void adaptQualityBonusRound(Item item) {
        if (item.sellIn < 0) {
            if (isAgedBrie(item)) {
                increaseQualityIfPossible(item);
            } else {
                if (isConcertTicket(item)) {
                    decreaseQuality(item);
                } else {
                    if (!ITEMS_WITH_CONSTANT_QUALITY.contains(item.name)) {
                        decreaseQuality(item);
                    }
                }
            }
        }
    }

    private boolean isAgedBrie(Item item) {
        return item.name.equals("Aged Brie");
    }

    private void adaptSellIn(Item item) {
        if (!ITEMS_WITH_CONSTANT_QUALITY.contains(item.name)) {
            item.sellIn--;
        }
    }

    private boolean hasQualityDecrease(Item item) {
        return !hasQualityIncrease(item) && !ITEMS_WITH_CONSTANT_QUALITY.contains(item.name);
    }

    private boolean hasQualityIncrease(Item item) {
        return ITEMS_WITH_QUALITY_INCREASE.contains(item.name) && item.quality < MAX_QUALITY;
    }

    private void adaptQuality(Item item) {
        if (hasQualityDecrease(item)) {
            decreaseQuality(item);
        } else if (hasQualityIncrease(item)) {
            increaseQualityIfPossible(item);
            adaptQualityConcertTicket(item);
        }
    }

    private void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }

    private void increaseQualityIfPossible(Item item) {
        if (item.quality < MAX_QUALITY) {
            item.quality++;
        }
    }

    private void adaptQualityConcertTicket(Item item) {

        if (isConcertTicket(item)) {
            if (item.sellIn < 11) {
                increaseQualityIfPossible(item);
            }

            if (item.sellIn < 6) {
                increaseQualityIfPossible(item);
            }
        }
    }

    private boolean isConcertTicket(Item item) {
        return item.name.equals(ITEM_CONCERT_TICKET);
    }
}