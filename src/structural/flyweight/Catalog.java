package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private Map<ItemName, Item> items = new HashMap<>();

    public Item lookup(ItemName itemName){
        if(!items.containsKey(itemName))
            items.put(itemName, new Item(itemName));
        return items.get(itemName);
    }

    public int totalItemsMade(){
        return items.size();
    }

    public enum ItemName {
        BOOK, GAME
    }

}
