package com.gildedrose.strategies.sell;

import com.gildedrose.Item;

public class DecreaseSellStrategy implements SellStrategy {

	@Override
	public void adjustDays(Item item) {
		item.sellIn = item.sellIn - 1;
	}
}
