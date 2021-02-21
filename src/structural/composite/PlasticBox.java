package structural.composite;

public class PlasticBox implements Box {
    @Override
    public int getVolume() {
        return 25;
    }

    @Override
    public void addBox(Box box) {
        throw new RuntimeException("Operation not supported. This is a small box!");
    }

    @Override
    public void removeBox(Box box) {
        throw new RuntimeException("Operation not supported. This is a small box!");
    }
}
