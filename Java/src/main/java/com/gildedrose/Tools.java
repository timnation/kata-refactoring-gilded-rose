package com.gildedrose;

/**
 * Created by Ferdinand.Szekeresch on 13.04.2017.
 */
public class Tools {

	public static int cappedDecrease(final int decrease, final int quality) {
		return Math.min(decrease, quality);
	}

	public static int cappedIncrease(final int increase, final int quality) {
		return Math.min(increase, 50 - quality);
	}
}
