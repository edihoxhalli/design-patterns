package creational.factory.method;

public class EcommerceTechShop extends Shop  {
    private static final int GAME_COST = 13;
    public EcommerceTechShop(){
        this.setShopType(ShopType.ECOMMERCE_TECH);
    }

    @Override
    public int getTotal(){
        return this.getOrders().size() * GAME_COST;
    }
}
