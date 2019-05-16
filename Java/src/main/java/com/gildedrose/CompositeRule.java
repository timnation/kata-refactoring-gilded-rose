package com.gildedrose;

import java.util.List;

public class CompositeRule implements ItemRule{

	private List<ItemRule> rules;

	public CompositeRule(List<ItemRule> rules) {
		this.rules = rules;
		
	}
	
	@Override
	public void apply(Item item) {
		rules.forEach(rule -> rule.apply(item));
	}

}
