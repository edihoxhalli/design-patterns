package creational.factory.method;

public class TechShop extends Shop{
    private static final int GAME_COST = 15;
    public TechShop(){
        this.setShopType(ShopType.TECHSHOP);
    }

    @Override
    public int getTotal(){
        return this.getOrders().size() * GAME_COST;
    }
}
