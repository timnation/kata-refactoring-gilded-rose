package com.gildedrose;
/** Open/Closed nicht wirklich gelöst, diese klasse muss immer angepasst werden, 
 * wenn neues Item mit spezialbehandlung hinzukommt -> neuer if zweig
 * => trotzdem deutliche Verbesserung gegenüber Anfang in Bezug auf O/C und auch in Bezug auf Single Responsibility
 * Idee: weitere Abstraktion der Rules, indem Produktname deklarativ auf die Rules gemapped wird.
 */
public class IRoseItemFactory {

	public IRoseItem createIRoseItem(Item item) {
		if (item.name.equals("Aged Brie")) {
			return new AgedBrie(item);
		}
		
		if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
			return new Sulfuras(item);
		}
		
		if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			return new TAFKAL80(item);
		}

		return new StandardItem(item);
	}
}
