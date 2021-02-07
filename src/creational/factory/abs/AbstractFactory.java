package creational.factory.abs;

import creational.factory.method.EcommerceFactory;
import creational.factory.method.Shop;
import creational.factory.method.ShopFactory;

public abstract class AbstractFactory {
    public static AbstractFactory getFactory(Shopper shopper){
        switch (shopper){
            case ONLINE:
                return new EcommerceFactory();
            case PHYSICAL:
                return new ShopFactory();
            default:
                return null;
        }
    }

    public abstract Shop createShop(Shop.ShopType shopType);

    public enum Shopper{
        PHYSICAL, ONLINE
    }
}
