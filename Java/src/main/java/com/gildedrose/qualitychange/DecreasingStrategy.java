package com.gildedrose.qualitychange;

import static com.gildedrose.Tools.cappedDecrease;

/**
 * Created by Ferdinand.Szekeresch on 13.04.2017.
 */
public class DecreasingStrategy implements QualityChangeStrategy {

	private int standardDecrease = 1;

	DecreasingStrategy(final int standardDecrease) {
		this.standardDecrease = standardDecrease;
	}

	DecreasingStrategy() {

	}

	@Override
	public Integer getQualityChange(int sellIn, int quality) {
		if (sellIn > 0) {
			return -cappedDecrease(standardDecrease, quality);
		}
		return -cappedDecrease(2*standardDecrease, quality);
	}


}
