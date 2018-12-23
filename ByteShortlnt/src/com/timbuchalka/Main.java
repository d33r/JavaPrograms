package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

//        // int has a width of 32
//        int myMinValue= -2147483648;
//        int myMaxValue= 2147483647;
//        int myTotal = (myMinValue/2);
//        System.out.println("myTotal = " + myTotal);
//
//        //byte has a width of 8
//        byte myByteValue = -128;
//        byte myNewByteValue = (byte) (myByteValue/2);
//        System.out.println("MyNewByteValue = " + myNewByteValue);
//
//        //short has a width of 16
//        short myShortValue = 32767;
//        short myNewShortValue = (short) (myShortValue / 2);
//
//        //long has a width of 64
//        long myLongValue = 9223372036854775807L;
//

        //1. Create a byte variable and set it to any valid byte number.
        //2. Create a short variable and set it to any valid short number.
        //3. Create a int variable and set it ti any valid int number.
        //4. Create a variable of type long, and make it equal to
        //   50000 + 10 times the sum of the byte, plus the short plus the int.

        byte myByteVariable = 10;
        short myShortVariable = 20;
        int myIntVariable = 50;
        long myLongTotalVariable = 50000L + 10L * ( myByteVariable + myShortVariable + myIntVariable);
        short myShortTotalVariable = (short) (1000 + 10 * (myByteVariable + myShortVariable + myIntVariable));
        System.out.println("longTotal = " + myLongTotalVariable);
        System.out.println("shortTotal = " + myShortTotalVariable);

    }
}
