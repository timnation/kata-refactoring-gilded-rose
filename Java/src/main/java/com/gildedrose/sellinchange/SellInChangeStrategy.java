package com.gildedrose.sellinchange;

/**
 * Created by Ferdinand.Szekeresch on 13.04.2017.
 */
public interface SellInChangeStrategy {

	default int getSellInChange(int sellIn, int quality) {
		return -1;
	}

}
