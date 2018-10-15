package com.gildedrose.strategies;

import java.util.ArrayList;
import java.util.List;

import com.gildedrose.Item;
import com.gildedrose.strategies.quality.AfterConcertQualityStrategy;
import com.gildedrose.strategies.quality.BeforeConcertQualityStrategy;
import com.gildedrose.strategies.quality.IncreaseQualityStrategy;
import com.gildedrose.strategies.quality.QualityStrategy;
import com.gildedrose.strategies.sell.DecreaseSellStrategy;
import com.gildedrose.strategies.sell.SellStrategy;

public class BackstagePassesUpdateStrategy implements ItemUpdateStrategy {
	
	private List<QualityStrategy> qualityStrategies = new ArrayList<>();
	private List<SellStrategy> sellStrategies = new ArrayList<>();
	
	public BackstagePassesUpdateStrategy() {
		qualityStrategies.add(new BeforeConcertQualityStrategy(10));
		qualityStrategies.add(new BeforeConcertQualityStrategy(5));
		qualityStrategies.add(new IncreaseQualityStrategy());
		qualityStrategies.add(new AfterConcertQualityStrategy());
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
		return "Backstage passes to a TAFKAL80ETC concert".equals(item.name);
	}
}
