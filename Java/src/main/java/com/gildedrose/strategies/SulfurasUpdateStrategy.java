package com.gildedrose.strategies;

import java.util.ArrayList;
import java.util.List;

import com.gildedrose.Item;
import com.gildedrose.strategies.quality.QualityStrategy;
import com.gildedrose.strategies.sell.SellStrategy;

public class SulfurasUpdateStrategy  implements ItemUpdateStrategy {
	
	private List<QualityStrategy> qualityStrategies = new ArrayList<>();
	private List<SellStrategy> sellStrategies = new ArrayList<>();

	@Override
	public List<QualityStrategy> getQualityStrategies() {
		return qualityStrategies;
	}

	@Override
	public List<SellStrategy> getSellStrategies() {
		return sellStrategies;
	}

	@Override
	public boolean appliesTo(Item item) {
		return "Sulfuras, Hand of Ragnaros".equals(item.name);
	}
}
