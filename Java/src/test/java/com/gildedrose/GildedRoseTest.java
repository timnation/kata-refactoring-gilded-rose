package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class GildedRoseTest {

	@Test
	public void doTestSomeThing() {
		Item brie = new Item("Aged Brie", 20, 50);
		List<Item> items = new ArrayList<>();
		for (int i = 0; i <= 100; i++) {
			Item numberedBrie = new Item("Aged Brie", 20, i);
			items.add(numberedBrie);
		}

		GildedRose gildedRose = new GildedRose(items.toArray(new Item[] {}));

		for (int i = 0; i < 22; i++) {
			gildedRose.updateQuality();
			items.stream().map(Item::toString).forEach(System.out::println);
		}
	}

	@Test
	public void testSystem() {
		List<Item> legacyItems = new ArrayList<>();
		List<Item> newItems = new ArrayList<>();

		legacyItems = generateMockData();
		newItems = generateMockData();

		generateLegacyOutput(legacyItems);
		generateNewSystemOutput(newItems);

		//assertEquals(legacyItems.toString(), newItems.toString());
		assertTrue(legacyItems.equals(newItems));
	}

	private List<Item> generateMockData() {
		List<Item> mockItems = new ArrayList<>();

		mockItems.addAll(generateProductItems("Aged Brie", 20, 100));
		mockItems.addAll(generateProductItems("Sulfuras, Hand of Ragnaros", 20, 100));
		mockItems.addAll(generateProductItems("Backstage passes to a TAFKAL80ETC concert", 20, 100));
		mockItems.addAll(generateProductItems("not available", 20, 100));

		return mockItems;
	}
	
	private List<Item> generateProductItems(String productname, int sellingIn, int qualityUpperBound) {
		List<Item> items = new ArrayList<Item>();
		
		for (int i = 0; i <= qualityUpperBound; i++) {
			Item numberedItem = new Item(productname, sellingIn, i);
			items.add(numberedItem);
		}
		
		return items;
	}

	private void generateLegacyOutput(List<Item> items) {
		GildedRose gildedRose = new GildedRose(items.toArray(new Item[] {}));

		for (int i = 0; i < 25; i++) {
			gildedRose.updateQuality();
		}
	}

	private void generateNewSystemOutput(List<Item> items) {
		// TODO: implement
	}

}
