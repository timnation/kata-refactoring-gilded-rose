package com.gildedrose;

import com.gildedrose.qualitychange.QualityChangeStrategy;
import com.gildedrose.qualitychange.QualityChangeStrategyFactory;
import com.gildedrose.sellinchange.SellInChangeStrategy;
import com.gildedrose.sellinchange.SellInChangeStrategyFactory;

import java.util.Arrays;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items).forEach(this::updateItem);
    }

    private void updateItem(Item item) {
        QualityChangeStrategy qualityChangeStrategy = QualityChangeStrategyFactory.get(item.name);
        SellInChangeStrategy sellInChangeStrategy = SellInChangeStrategyFactory.get(item.name);
        item.quality += qualityChangeStrategy.getQualityChange(item.sellIn, item.quality);
        item.sellIn += sellInChangeStrategy.getSellInChange(item.sellIn, item.quality);
    }
}