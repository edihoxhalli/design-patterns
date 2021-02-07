package creational.prototype;

public class Cow extends Animal{
    @Override
    public String getType() {
        return "Cow";
    }

    @Override
    public boolean isPet(){
        return false;
    }
}
