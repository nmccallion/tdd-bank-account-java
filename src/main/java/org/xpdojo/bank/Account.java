package org.xpdojo.bank;

public class Account {

    private int balance;

    public static Account emptyAccount() {
        return new Account();
    }

    private Account() {
        //intentionally left blank
    }

    public int balance() {
        return balance;
    }

    public void deposit(int i) {
        balance += i;
    }
}
