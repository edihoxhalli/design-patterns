package creational.factory.method;

import java.util.LinkedList;
import java.util.List;

public abstract class Shop {
    private List<String> orders;
    private ShopType shopType;

    public Shop(){
        this.orders = new LinkedList<>();

    }

    public List<String> getOrders() {
        return orders;
    }

    public abstract int getTotal();

    public void setShopType(ShopType shopType){
        this.shopType = shopType;
        System.out.println("New Shop: "+ this.shopType.toString());
    }

    public enum ShopType {
        BOOKSHOP, TECHSHOP, ECOMMERCE_BOOKS, ECOMMERCE_TECH
    }
}
