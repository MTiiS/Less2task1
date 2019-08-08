package com.company;

public class Triangle extends Shape {


    private Point a;
    private Point b;
    private Point c;



    public Triangle() {
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

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

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }



    @Override
    double calculatePerimetr() {

        double sideA = Point.calculateDistance(a, b);
        double sideB = Point.calculateDistance(b, c);
        double sideC = Point.calculateDistance(c, a);

        return sideA + sideB + sideC;
    }

    @Override
    double calculateArea() {

        double sideA = Point.calculateDistance(a, b);
        double sideB = Point.calculateDistance(b, c);
        double sideC = Point.calculateDistance(c, a);

        double p = this.calculatePerimetr() / 2.0;
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
