package org.xpdojo.bank;

public class Account {

    private double balance;

    public static Account emptyAccount() {
        return new Account();
    }

    private Account() {
        //intentionally left blank
    }

    public double balance() {
        return balance;
    }

    public void deposit(double i) {
        balance += i;
    }
}
