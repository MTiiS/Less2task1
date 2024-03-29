package com.company;

public class Point {
    private double x;
    private double y;


    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }



    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static double calculateDistance (Point a, Point b){

        return Math.sqrt(Math.pow((b.x- a.x), 2 )+ Math.pow((b.y - a.y),2) );


    }
}
