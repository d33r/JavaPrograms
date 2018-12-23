package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvanNumber(number)) {
                continue;
            }
            System.out.println("Evan number " + number);
            evenNumbersFound++;
            if (evenNumbersFound >=5){
                break;
            }

        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvanNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
