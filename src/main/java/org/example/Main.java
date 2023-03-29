package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Umar", "Twynam", "31/05/1997", "12345");
        BankAccount acc2 = new BankAccount("John", "Smith", "01/01/2000", "67890");

        acc1.setBalance(100);
        System.out.println(acc1.getBalance());

        acc1.deposit(50);
        acc1.withdraw(0);


    }
}