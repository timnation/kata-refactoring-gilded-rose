package com.gildedrose.strategies;

import java.util.List;

import com.gildedrose.Item;
import com.gildedrose.strategies.quality.QualityStrategy;
import com.gildedrose.strategies.sell.SellStrategy;

public interface ItemUpdateStrategy {
	
	List<QualityStrategy> getQualityStrategies();
	
	List<SellStrategy> getSellStrategies();
	
	boolean appliesTo(Item item);

}
