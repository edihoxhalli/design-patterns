package structural.composite;

public class CartonBox implements Box {
    @Override
    public void addBox(Box box) {
        throw new RuntimeException("Operation not supported. This is a small box!");
    }

    @Override
    public void removeBox(Box box) {
        throw new RuntimeException("Operation not supported. This is a small box!");
    }

    @Override
    public int getVolume() {
        return 12;
    }
}
