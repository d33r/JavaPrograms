package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(13, 1);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchesToCentimeters(157);
    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("invalid feet or inches parameters");
            return -1;
        }
        double centimaters = (feet * 12) * 2.54;
        centimaters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimaters + " cm");
        return centimaters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}




