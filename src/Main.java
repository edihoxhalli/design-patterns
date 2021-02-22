import behavioral.chain_of_responsability.CEO;
import behavioral.chain_of_responsability.Handler;
import behavioral.chain_of_responsability.HumanResources;
import behavioral.chain_of_responsability.Sales;
import behavioral.command.Command;
import behavioral.command.Light;
import behavioral.command.OnCommand;
import behavioral.command.Switch;
import creational.builder.Book;
import creational.factory.abs.AbstractFactory;
import creational.factory.method.Shop;
import creational.factory.method.ShopFactory;
import creational.prototype.Animal;
import creational.prototype.AnimalRegistry;
import creational.singleton.Connection;
import structural.adapter.Shape;
import structural.adapter.Square;
import structural.adapter.Triangle;
import structural.adapter.TriangleAdapter;
import structural.bridge.*;
import structural.composite.BigBox;
import structural.composite.Box;
import structural.composite.CartonBox;
import structural.composite.PlasticBox;
import structural.decorator.Bachelors;
import structural.decorator.Diploma;
import structural.decorator.HighSchool;
import structural.decorator.Masters;
import structural.facade.DriveFacade;
import structural.flyweight.Catalog;
import structural.flyweight.InventorySystem;
import structural.proxy.SecurityProxy;
import structural.proxy.TwitterService;
import structural.proxy.TwitterServiceStub;

import java.util.Arrays;
import java.util.LinkedList;
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
//        adapter();
//        bridge();
//        composite();
//        decorator();
//        facade();
//        flyweight();
//        proxy();

        /** -- BEHAVIORAL --
         */
//        chainOfResponsability();
//        command();

    }

    static void command(){
        Light light = new Light();
        Switch lightSwitch = new Switch();

        Command onCommand = new OnCommand(light);

        lightSwitch.storeAndExecute(onCommand);
    }

    static void chainOfResponsability(){
        CEO ceo = new CEO();
        Sales sales = new Sales(ceo);
        HumanResources humanResources = new HumanResources(sales);

        humanResources.handleRequest(Handler.Request.MANAGERIAL);
        humanResources.handleRequest(Handler.Request.PURCHASE);
        humanResources.handleRequest(Handler.Request.HR);
    }

    /** -- STRUCTURAL --
     */
    static void proxy(){
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
        System.out.println(service.getTimeline("asdf"));
        service.postToTimeline("editwitter", "this will not go through");
    }

    static void bridge() {
        Job teacher = new Teacher();
        Job musician = new Musician();

        Student mathStudent = new MathStudent(teacher);
        Student thomYorke = new CantoStudent(musician);

        List<Student> students = Arrays.asList(mathStudent, thomYorke);
        students.forEach(student -> student.learn());
    }

    static void adapter(){
        List<Shape> shapes = new LinkedList<>();
        Shape square = new Square(2.5F);

        shapes.add(square);

        Triangle t1 = new Triangle(3, 4, 5);
        Triangle t2 = new Triangle(5, 7, 12);

        Shape t1Adapter = new TriangleAdapter(t1);
        Shape t2Adapter = new TriangleAdapter(t2);

        shapes.add(t1Adapter);
        shapes.add(t2Adapter);

        shapes.forEach(s -> {
            System.out.println(s);
            System.out.println(s.getArea());
            System.out.println(s.getPerimeter());
        });

    }

    static void composite(){
        Box box1 = new CartonBox();
        Box box2 = new PlasticBox();

        Box bigBox = new BigBox();
        bigBox.addBox(box1);
        bigBox.addBox(box2);

        ((BigBox) bigBox).getBoxes().forEach(box -> System.out.println("Box type: " + box.getClass().getSimpleName() + ", Volume: " + box.getVolume()));

        System.out.println("Box type: " + bigBox.getClass().getSimpleName() + ", Volume: " + bigBox.getVolume());
    }

    static void decorator(){
        Diploma diploma = new Masters(new Bachelors(new HighSchool()));
        for (String d:
                diploma.getDiploma()) {
            System.out.println(d);
        }
    }

    static void facade(){
        DriveFacade driveFacade = new DriveFacade();
        driveFacade.drive();
    }

    static void flyweight(){
        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.takeOrder(Catalog.ItemName.BOOK, 123);
        inventorySystem.takeOrder(Catalog.ItemName.BOOK, 43);
        inventorySystem.takeOrder(Catalog.ItemName.GAME, 5);
        inventorySystem.takeOrder(Catalog.ItemName.GAME, 54);
        inventorySystem.takeOrder(Catalog.ItemName.BOOK, 43);

        inventorySystem.process();
        inventorySystem.report();
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
