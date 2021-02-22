package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class InventorySystem {
    private final Catalog catalog = new Catalog();
    private final List<Order> orders = new ArrayList<>();

    public void takeOrder(Catalog.ItemName itemName, int orderNumber){
        Order order = new Order(catalog.lookup(itemName), orderNumber);
        orders.add(order);
    }

    public void process(){
        this.orders.forEach(Order::processOrder);
    }

    public void report(){
        System.out.println("Total items made: "+ catalog.totalItemsMade());
        System.out.println("Number of orders: "+ orders.size());
    }
}
