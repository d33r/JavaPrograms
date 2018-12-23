package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

//        Bank bob = new Bank("1234", 0.0, "Bob", "myemail@bob.com", "(087) 123 4567");
//        System.out.println(bob.getAccountNumber());
//        System.out.println(bob.getBalance());
//
//        bob.withdrawal(100.0);
//
//        bob.deposit(50.0);
//        bob.withdrawal(100.0);
//
//        bob.deposit(51.0);
//        bob.withdrawal(100.0);
//
        Bank tim = new Bank("tim","tim@gmail.com","123456");
        System.out.println(tim.getAccountNumber() + " name " + tim.getCustomerName());
        System.out.println("Current balance is " + tim.getBalance());
        tim.withdrawal(100.55);

//        VipCustomer customer1 = new VipCustomer();
//        System.out.println(customer1.getName());
//
//        VipCustomer customer2 = new VipCustomer("Bob", 25000.00);
//        System.out.println(customer2.getName());
//
//        VipCustomer customer3 = new VipCustomer("Tim", 10000, "tim@email.com");
//        System.out.println(customer3.getName());
//        System.out.println(customer3.getEmailAdress());
    }
}
