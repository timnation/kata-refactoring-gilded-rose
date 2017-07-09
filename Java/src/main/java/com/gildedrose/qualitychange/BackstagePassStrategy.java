package com.gildedrose.qualitychange;

import static com.gildedrose.Tools.cappedIncrease;

/**
 * Created by Ferdinand.Szekeresch on 13.04.2017.
 */
public class BackstagePassStrategy implements QualityChangeStrategy {

	@Override
	public Integer getQualityChange(int sellIn, int quality) {
		if (sellIn <= 0) {
			return -quality;
		}
		if (sellIn > 10) {
			return cappedIncrease(1, quality);
		} else if (sellIn <= 5) {
			return cappedIncrease(3, quality);
		} else if (sellIn <= 10) {
			return cappedIncrease(2, quality);
		}
		return 0;
	}
}
