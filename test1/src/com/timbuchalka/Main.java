package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number){
        if(number < 5) System.out.println("Invalid Value");
        else{

            for (int column = 1; column <= number; column++){
                System.out.print("| col |");
                for (int row = 1; row <= number-1; row++){
                    if( column == 1 || column == number || row + 1 == column
                            || row == number - 1 || number - column == row
                    ){
                        System.out.print(" row |");
                    }

                    else System.out.print("     |");
                }
                System.out.println();
            }
        }
    }
}