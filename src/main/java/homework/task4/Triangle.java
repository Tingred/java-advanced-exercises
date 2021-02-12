package homework.task4;

import inheritance.Panda;

public class Triangle extends Shape {

    public Triangle(Point pointA, Point pointB, Point pointC){
        super(new Point[]{pointA,pointB,pointC
        });
    }

    @Override
    double area() {
        double a = Math.sqrt(Math.pow((points[1].x-points[0].x),2) + Math.pow((points[1].y- points[0].y),2));
        double b = Math.sqrt(Math.pow((points[2].x-points[1].x),2) + Math.pow((points[2].y- points[1].y),2));
        double c = Math.sqrt(Math.pow((points[0].x-points[2].x),2) + Math.pow((points[0].y- points[2].y),2));
        double smallP = (a+b+c)/2;
        return Math.sqrt(smallP*(smallP-a)*(smallP-b)*(smallP-c));
    }
}
