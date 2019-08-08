package com.company;

public class Square extends Shape {

    private Point a;
    private Point b;


    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Square(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculatePerimetr() {

        double side = Point.calculateDistance(a, b);
        return (side + side) * 2;
    }

    @Override
    double calculateArea() {

        double side = Point.calculateDistance(a,b);
        return side * 4;
    }


    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
