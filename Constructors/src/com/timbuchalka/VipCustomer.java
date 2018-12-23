package com.timbuchalka;

public class VipCustomer {

    public String name;
    public double creditLimit;
    public String emailAdress;

    public VipCustomer(){
        this("Default name", 50000.00, "default@email.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unkow@email.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
