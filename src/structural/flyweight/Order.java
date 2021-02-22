package structural.flyweight;

public class Order {

    private final int orderNumber;
    private final Item item;

    public Order(Item item, int orderNumber){
        this.orderNumber = orderNumber;
        this.item = item;
    }

    void processOrder(){
        System.out.println("Order number: "+ this.orderNumber+ "; Item: "+ item);
    }
}
