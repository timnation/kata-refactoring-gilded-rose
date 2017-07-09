package com.gildedrose.sellinchange;

/**
 * Created by Ferdinand.Szekeresch on 13.04.2017.
 */
public class ConstantSellInStrategy implements SellInChangeStrategy {

	@Override
	public int getSellInChange(int sellIn, int quality) {
		return 0;
	}
}
