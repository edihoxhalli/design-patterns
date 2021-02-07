package creational.prototype;

public class Dog extends Animal {
    @Override
    public String getType() {
        return "Dog";
    }


    @Override
    public boolean isPet(){
        return true;
    }
}
