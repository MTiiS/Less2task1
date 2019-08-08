package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Shape triangle = new Triangle(new Point(0, 0), new Point(0, 4), new Point(3, 0));
        Shape circle = new Circle(new Point(0, 0), new Point(0, 4));
        Shape square = new Square(new Point(0, 0), new Point(4, 4));
        Shape square2 = new Square(new Point(0, 0), new Point(1, 1));


        Board board = new Board();
        board.addShape(triangle);


        board.addShape(circle);
        board.addShape(triangle);
        board.addShape(square);
        board.addShape(square2);
        board.delShape(1);

        board.info();

    }
}
