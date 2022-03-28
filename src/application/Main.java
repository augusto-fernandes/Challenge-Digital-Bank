package application;

import model.Account;
import model.CheckingAccount;
import model.Client;
import model.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Client john = new Client();
        john.setName("John");

        Account ca = new CheckingAccount(john);
        Account sa = new SavingsAccount(john);
        
        ca.deposit(100);
        ca.transfer(100,sa);

        ca.printExtract();
        sa.printExtract();


    }
}
