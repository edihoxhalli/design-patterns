package creational.factory.method;

import creational.factory.abs.AbstractFactory;

public class EcommerceFactory extends AbstractFactory {
    public Shop createShop(Shop.ShopType shopType){
        switch (shopType){
            case ECOMMERCE_BOOKS:{
                return new EcommerceBookShop();
            }
            case ECOMMERCE_TECH:{
                return new EcommerceTechShop();
            }
            default: throw new RuntimeException("WRONG FACTORY!!!");
        }
    }
}
