package creational.prototype;

public class Cat extends Animal {

    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public boolean isPet(){
        return true;
    }
}
