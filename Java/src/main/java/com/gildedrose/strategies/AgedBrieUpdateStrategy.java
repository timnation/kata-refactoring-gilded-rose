package com.gildedrose.strategies;

import java.util.ArrayList;
import java.util.List;

import com.gildedrose.Item;
import com.gildedrose.strategies.quality.IncreaseAfterSellDateQualityStrategy;
import com.gildedrose.strategies.quality.IncreaseQualityStrategy;
import com.gildedrose.strategies.quality.QualityStrategy;
import com.gildedrose.strategies.sell.DecreaseSellStrategy;
import com.gildedrose.strategies.sell.SellStrategy;

public class AgedBrieUpdateStrategy implements ItemUpdateStrategy {
	
	private List<QualityStrategy> qualityStrategies = new ArrayList<>();
	private List<SellStrategy> sellStrategies = new ArrayList<>();
	
	public AgedBrieUpdateStrategy() {
		qualityStrategies.add(new IncreaseQualityStrategy());
		qualityStrategies.add(new IncreaseAfterSellDateQualityStrategy());
		sellStrategies.add(new DecreaseSellStrategy());
	}

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
		return "Aged Brie".equals(item.name);
	}
}
