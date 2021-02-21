package structural.adapter;

public class TriangleAdapter implements Shape {
    Triangle adaptee;

    public TriangleAdapter(Triangle adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public float getArea() {

        //Area	=	 √	 p	 (	p	−	a	) 	(	p	−	b	)	 (	p	−	c	)
        float p = this.getPerimeter() / 2;
        float a = this.adaptee.getSideA();
        float b = this.adaptee.getSideB();
        float c = this.adaptee.getSideC();

        return (float) Math.sqrt((p * (p - a) * (p - b) * (p - c)));
    }

    @Override
    public float getPerimeter() {
        return this.adaptee.getSideA() + this.adaptee.getSideB() + this.adaptee.getSideC();
    }
}
