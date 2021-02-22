package structural.flyweight;

public class Item {
    private final Catalog.ItemName name;

    public Item(Catalog.ItemName name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
}
