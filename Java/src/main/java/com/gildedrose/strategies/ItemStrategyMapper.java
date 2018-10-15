package com.gildedrose.strategies;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.gildedrose.Item;

public class ItemStrategyMapper {

	List<ItemUpdateStrategy> installedStrategies;

	public ItemStrategyMapper() {
		installedStrategies = new ArrayList<>();
		installedStrategies.add(new AgedBrieUpdateStrategy());
		installedStrategies.add(new BackstagePassesUpdateStrategy());
		installedStrategies.add(new SulfurasUpdateStrategy());
	}

	public List<ItemUpdateStrategy> findStrategiesForItem(Item item) {
		List<ItemUpdateStrategy> strategies = installedStrategies.stream().filter(installedStrategy -> installedStrategy.appliesTo(item))
		.collect(Collectors.toList());
		if(strategies.isEmpty()) {
			strategies.add(new DefaultUpdateStrategy());
		}
		return strategies;
	}
}
