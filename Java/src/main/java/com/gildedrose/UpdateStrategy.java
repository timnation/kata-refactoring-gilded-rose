package com.gildedrose;

public interface UpdateStrategy {
	boolean isRelevant(Item item);
	int calculateChange(Item item);
}
