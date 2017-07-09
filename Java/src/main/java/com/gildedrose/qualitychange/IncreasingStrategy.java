package com.gildedrose.qualitychange;

import static com.gildedrose.Tools.cappedIncrease;

/**
 * Created by Ferdinand.Szekeresch on 13.04.2017.
 */
public class IncreasingStrategy implements QualityChangeStrategy {

	private int standardIncrease = 1;

	IncreasingStrategy(final int standardIncrease) {
		this.standardIncrease = standardIncrease;
	}

	IncreasingStrategy() {

	}

	@Override
	public Integer getQualityChange(int sellIn, int quality) {
		if (sellIn > 0) {
			return cappedIncrease(standardIncrease, quality);
		}
		return 2*cappedIncrease(standardIncrease,quality);
	}
}
