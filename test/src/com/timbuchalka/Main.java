package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        getLargestPrime(21);
    }

    public static int getLargestPrime(int number) {
        int largestprime = 0;
        if (number <= 0 || number == 0 || number == 1) {
            return -1;
        }

        while(number>0){

            int i = 2;
            if (number%i==0){
                number /= i;
                largestprime = i;
                i++;
                System.out.println(i);
                System.out.println(number);
                System.out.println(largestprime);
                if(largestprime < i){
                    largestprime = i;
                }
            }
        }
        return largestprime;
    }
}
