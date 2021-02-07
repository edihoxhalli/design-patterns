import creational.builder.Book;
import creational.factory.abs.AbstractFactory;
import creational.factory.method.Shop;
import creational.factory.method.ShopFactory;
import creational.prototype.Animal;
import creational.prototype.AnimalRegistry;
import creational.singleton.Connection;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        /** -- CREATIONAL --
        singleton();
        builder();
        prototype();
        factoryMethod();
        abstactFactory();
         */

        /** -- STRUCTURAL --
         */

    }



    /** CREATIONAL
     */
    static void singleton(){
        Connection connection = Connection.getInstance();

        Connection connection1 = Connection.getInstance();

        if (connection == connection1)
            System.out.println("Same instance!");
        else
            throw new RuntimeException("Singleton not correct!!!");
    }

    static void builder(){
        Book.Builder bookBuilder = new Book.Builder("Design Patterns", "Gang of Four");
        bookBuilder.pages(500).type(Book.Type.COMPUTER_SCIENCE);
        Book book = bookBuilder.build();

        System.out.println(book);

        Book.Builder anotherBookBuilder = new Book.Builder("Star Wars", "Stephen Hawkings");
        anotherBookBuilder.pages(255).type(Book.Type.SCIENCE_FICTION);
        Book anotherBook = anotherBookBuilder.build();

        System.out.println(anotherBook);
    }

    static void prototype(){
        AnimalRegistry animalRegistry = new AnimalRegistry();
        Animal dog = animalRegistry.createAnimal("Dog");
        dog.setAge(15);
        dog.setType("OLD DOGO");


        Animal anotherDog = animalRegistry.createAnimal("Dog");
        anotherDog.setAge(0.5f);
        anotherDog.setType("Puppy!!");

        System.out.println(dog);
        System.out.println(anotherDog);
    }

    static void factoryMethod(){
        ShopFactory factory = new ShopFactory();

        Shop shop = factory.createShop(Shop.ShopType.BOOKSHOP);
        List<String> orders = shop.getOrders();
        orders.add("The Little Prince");
        orders.add("Design Patterns");

        System.out.println(shop.getTotal());

        Shop anotherShop = factory.createShop(Shop.ShopType.TECHSHOP);
        List<String> newOrders = anotherShop.getOrders();
        newOrders.add("Prince of Persia");
        newOrders.add("The SIMS");

        System.out.println(anotherShop.getTotal());
    }

    static void abstactFactory(){
        AbstractFactory factory = AbstractFactory.getFactory(AbstractFactory.Shopper.ONLINE);
        Shop shop = factory.createShop(Shop.ShopType.ECOMMERCE_BOOKS);
        shop.getOrders().add("Web for Dummies!");

        System.out.println(shop.getTotal());

        AbstractFactory anotherFactory = AbstractFactory.getFactory(AbstractFactory.Shopper.PHYSICAL);
        Shop anotherShop = anotherFactory.createShop(Shop.ShopType.BOOKSHOP);
        anotherShop.getOrders().add("Physical World");

        System.out.println(anotherShop.getTotal());

        AbstractFactory thirdFactory = AbstractFactory.getFactory(AbstractFactory.Shopper.PHYSICAL);
        try {
            Shop wrongShop = thirdFactory.createShop(Shop.ShopType.ECOMMERCE_TECH);
        } catch (RuntimeException e){
            e.printStackTrace();
        }
    }


}
