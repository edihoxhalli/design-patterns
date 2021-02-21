package structural.composite;

import java.util.LinkedList;
import java.util.List;

public class BigBox implements Box{

    List<Box> boxes = new LinkedList<>();

    @Override
    public void addBox(Box box) {
        boxes.add(box);
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    @Override
    public void removeBox(Box box) {
        boxes.remove(box);
    }

    @Override
    public int getVolume() {
        return 60;
    }


}
