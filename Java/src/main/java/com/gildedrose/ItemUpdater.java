package com.gildedrose;

public class ItemUpdater {
	private final QualityUpdater qualityUpdater;
	private final SellInUpdater sellInUpdater;
	
	public ItemUpdater(QualityUpdater qualityUpdater, SellInUpdater sellInUpdater) {
		this.qualityUpdater = qualityUpdater;
		this.sellInUpdater = sellInUpdater;
	}
	
	public void update(Item item) {
		qualityUpdater.update(item);
		sellInUpdater.update(item);
	}
}
