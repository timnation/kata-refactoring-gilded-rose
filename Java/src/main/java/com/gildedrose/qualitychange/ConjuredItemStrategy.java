package com.gildedrose.qualitychange;

import com.gildedrose.Tools;

/**
 * Created by Ferdinand.Szekeresch on 13.04.2017.
 */
public class ConjuredItemStrategy implements QualityChangeStrategy {

	private DecreasingStrategy standardDegradation;
	public ConjuredItemStrategy() {
		this.standardDegradation = new DecreasingStrategy();
	}

	@Override
	public Integer getQualityChange(int sellIn, int quality) {
		return Tools.cappedDecrease(2*standardDegradation.getQualityChange(sellIn, quality), quality);
	}
}
