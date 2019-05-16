package com.gildedrose;

public class DecrementSellInRule implements ItemRule{

	@Override
	public void apply(Item item) {
		item.sellIn -= 1;
	}
}
