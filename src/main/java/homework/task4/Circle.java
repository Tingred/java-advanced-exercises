package homework.task4;

public class Circle extends Shape{

    private final int radius;

    public Circle(Point point,int radius) {
        super(new Point[]{
                point
        });
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius, 2);
    }
}
