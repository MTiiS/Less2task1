package com.company;

public class Circle extends Shape{

    private Point o;
    private Point a;

   ;

    public Circle() {
    }

    public Circle(Point o, Point a) {
        this.o = o;
        this.a = a;
    }


    public Point getO() {
        return o;
    }

    public void setO(Point o) {
        this.o = o;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Сircle{" +
                "o=" + o +
                ", a=" + a +
                '}';
    }

    @Override
    double calculatePerimetr() {
        double radius = Point.calculateDistance(o,a);
        return 2*Math.PI*radius;
    }

    @Override
    double calculateArea() {
        double radius = Point.calculateDistance(o,a);
        return Math.pow((Math.PI*radius), 2);
    }
}
