package structural.composite;

public interface Box {
    int getVolume();
    void addBox(Box box);
    void removeBox(Box box);
}
