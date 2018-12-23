package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
//        isLeapYear(2018);
//        isLeapYear(2020);
//        isLeapYear(-1);
        getDaysInMonth(1, 2020);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                //System.out.println("TRUE");
                return true;
            }
            //System.out.println("False");
            return false;
        }
        //System.out.println("False");
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        } else if (year < 1 || year > 9999) {
            return -1;
        } else if (isLeapYear(year) == true) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 2:
                    return 29;
            }
        } else if (isLeapYear(year) == false) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 2:
                    return 28;
            }
        } else{
            return -1;
        }
        return 0;
    }
}