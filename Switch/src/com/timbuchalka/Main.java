package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	char charValue = 'A';

        public static void numberToWords(int number){
            if(number<0){
                System.out.println("Invalid Value");
            }
            while(number>0){
                int digit = number%10;
                switch(digit){
                    case '0':
                        System.out.println("Zero");
                        break;
                    case '1':
                        System.out.println("One");
                        break;
                    case '2':
                        System.out.println("Two");
                        break;
                    case '3':
                        System.out.println("Three");
                        break;
                    case '4':
                        System.out.println("Four");
                        break;
                    case '5':
                        System.out.println("Five");
                        break;
                    case '6':
                        System.out.println("Six");
                        break;
                    case '7':
                        System.out.println("Seven");
                        break;
                    case '8':
                        System.out.println("Eight");
                        break;
                    case '9':
                        System.out.println("Nine");
                        break;
                }
                int number /= 10;
            }
}
