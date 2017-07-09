package com.gildedrose.qualitychange;

/**
 * Created by Ferdinand.Szekeresch on 13.04.2017.
 */
public class ConstantQualityStrategy implements QualityChangeStrategy {

	@Override
	public Integer getQualityChange(int sellIn, int quality) {
		return 0;
	}
}
