package creational.factory.method;

public class BookShop extends Shop {
    private static final int BOOK_COST = 10;
    public BookShop(){
        this.setShopType(ShopType.BOOKSHOP);
    }

    @Override
    public int getTotal(){
        return this.getOrders().size() * BOOK_COST;
    }
}
