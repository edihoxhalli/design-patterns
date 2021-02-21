package structural.adapter;

public class Square implements Shape {

    float side;

    public Square(float side){
        this.side = side;
    }

    @Override
    public float getArea() {
        return this.side * this.side;
    }

    @Override
    public float getPerimeter() {
        return this.side * 4;
    }
}
