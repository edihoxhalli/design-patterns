package creational.factory.method;

import creational.factory.abs.AbstractFactory;

public class ShopFactory extends AbstractFactory {

    public Shop createShop(Shop.ShopType shopType){
        switch (shopType){
            case BOOKSHOP:{
                return new BookShop();
            }
            case TECHSHOP:{
                return new TechShop();
            }
            default: throw new RuntimeException("WRONG FACTORY!!!");
        }
    }
}
