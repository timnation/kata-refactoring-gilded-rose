package com.gildedrose.sellinchange;

/**
 * Created by Ferdinand.Szekeresch on 13.04.2017.
 */
public class SellInChangeStrategyFactory {

	public static SellInChangeStrategy get(final String itemName) {
		if (itemName.equals("Sulfuras, Hand of Ragnaros")) {
			return new ConstantSellInStrategy();
		}
		return new SellInChangeStrategy() {};
	}

}
