package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Board {


    private Shape[] partsOfBoard = new Shape[4];
    private static int countParts = 0;
    private static boolean onBoard;

    public Board() {
    }

    public Shape[] getPartsOfBoard() {
        return partsOfBoard;
    }

    public void setPartsOfBoard(Shape[] partsOfBoard) {
        this.partsOfBoard = partsOfBoard;
    }


    public void addShape(Shape shape) {    //Добавити на вільне місце

        for (Shape s : partsOfBoard) {
            if (s!= null && s.equals(shape)) {
                onBoard = true;
            }
        }

        if (countParts == 4) {
            System.out.println("No more places"+"\n");
        } else if (onBoard == true){
            System.out.println("Shape " + shape + " is already on the board"+"\n" );
            onBoard = false;
        }
        else{
            for (int i = 0; i < 4; i++) {
                if (partsOfBoard[i] == null) {
                    partsOfBoard[i] = shape;
                    System.out.println("add shape "+ shape+"\n");
                    countParts++;
                    break;
                }
            }

        }


        // System.out.println(Arrays.toString(partsOfBoard));
    }

    public void addShape(Shape shape, int i) { // Добавити на вказане місце


    }

    public void delShape(int i){

        if (i > 3){
            System.out.println("wrong input"+"\n");
        }

        else if (partsOfBoard[i] == null){
            System.out.println("this part of the board is already empty"+"\n");
        }

        else {
            System.out.println(partsOfBoard[i]+ "deleted from the " + i + "position"+"\n");
            partsOfBoard[i] = null;

        }


    }

    public void info(){

        double sum = 0;

        for (Shape s : partsOfBoard) {
            if(s !=null){
               sum += s.calculateArea();
                System.out.println(s);

            }


        }
        System.out.println(sum);
    }




}
