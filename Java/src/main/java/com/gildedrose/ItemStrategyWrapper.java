package com.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class ItemStrategyWrapper {
	private Item item;
	private List<UpdateStrategy> strategies = new ArrayList<>();
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public List<UpdateStrategy> getStrategies() {
		return strategies;
	}
}
