package com.timbuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum =0;

        while(counter < 11){
            System.out.println("Enter number " + counter + " :");
            int number = scanner.nextInt();
            counter++;
            sum += number;
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}
