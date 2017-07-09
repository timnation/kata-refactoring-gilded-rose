package com.gildedrose.qualitychange;

/**
 * Created by Ferdinand.Szekeresch on 13.04.2017.
 */
public class QualityChangeStrategyFactory {

	public static QualityChangeStrategy get(final String itemName) {
		switch (itemName) {
		case "Aged Brie":
			return new IncreasingStrategy();
		case "Backstage passes to a TAFKAL80ETC concert":
			return new BackstagePassStrategy();
		case "Sulfuras, Hand of Ragnaros":
			return new ConstantQualityStrategy();
		default:
			return new DecreasingStrategy();
		}
	}

}
