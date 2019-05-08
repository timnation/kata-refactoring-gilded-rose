package com.gildedrose;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GildedRoseTest {
	
	List<Item> agedBries;
	List<Item> sulfuras;
	List<Item> backstagePasses;
	
	@Before
	public void mockItemsForTests() {
		List<String> names = new ArrayList<String>();
		names.add("Aged Brie");
		names.add("Sulfuras, Hand of Ragnaros");
		names.add("Backstage passes to a TAFKAL80ETC concert");
		
		List<Item> agedBries = new ArrayList<Item>();
		List<Item> sulfuras = new ArrayList<Item>();
		List<Item> backstagePasses = new ArrayList<Item>();
		for (String name : names) {
			for (int i = -1; i <= 11; i++) {
	        	for (int j = 0; j <= 100; j++) {
	        		Item item = new Item(name, i, j);
	        		
	        		switch(name) {
	        			case "Aged Brie":
	        				agedBries.add(item);
	        				break;
	        			case "Sulfuras, Hand of Ragnaros":
	        				sulfuras.add(item);
	        				break;
	        			case "Backstage passes to a TAFKAL80ETC concert":
	        				backstagePasses.add(item);
	        				break;
        				default:
        					break;	        			
	        		}
	        		
				}
	            
	        }
		}
		
		
		System.out.println("---------------------------------------------------------");
        backstagePasses.stream().map(Item::toString).forEach(System.out::println);
		System.out.println("---------------------------------------------------------");


		
		
		
		
		
	}

    @Test
    public void showAgedBrieChanges() {
    	System.out.println("---------------------------------------------------------");
		agedBries.stream().map(Item::toString).forEach(System.out::println); 
		
    }
    
    @Test
    public void showSulfurasChanges() {
    	
    	System.out.println("---------------------------------------------------------");
        sulfuras.stream().map(Item::toString).forEach(System.out::println);
    }
    
    @Test
    public void showbackstagePassesChanges() {
    	
    	System.out.println("---------------------------------------------------------");
    	backstagePasses.stream().map(Item::toString).forEach(System.out::println);
    }
    


        
   
    
}
