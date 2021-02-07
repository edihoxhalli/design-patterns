package creational.factory.method;

public class EcommerceBookShop extends Shop {
    private static final int BOOK_COST = 9;
    public EcommerceBookShop(){
        this.setShopType(ShopType.ECOMMERCE_BOOKS);
    }

    @Override
    public int getTotal(){
        return this.getOrders().size() * BOOK_COST;
    }
}
