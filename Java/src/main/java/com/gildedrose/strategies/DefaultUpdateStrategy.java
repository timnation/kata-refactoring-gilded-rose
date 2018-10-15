package com.gildedrose.strategies;

import java.util.ArrayList;
import java.util.List;

import com.gildedrose.Item;
import com.gildedrose.strategies.quality.DecreaseAfterSellDateQualityStrategy;
import com.gildedrose.strategies.quality.DecreaseQualityStrategy;
import com.gildedrose.strategies.quality.QualityStrategy;
import com.gildedrose.strategies.sell.DecreaseSellStrategy;
import com.gildedrose.strategies.sell.SellStrategy;

public class DefaultUpdateStrategy  implements ItemUpdateStrategy {
	
	private List<QualityStrategy> qualityStrategies = new ArrayList<>();
	private List<SellStrategy> sellStrategies = new ArrayList<>();
	
	public DefaultUpdateStrategy() {
		qualityStrategies.add(new DecreaseQualityStrategy());
		qualityStrategies.add(new DecreaseAfterSellDateQualityStrategy());
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
		return true;
	}
}
