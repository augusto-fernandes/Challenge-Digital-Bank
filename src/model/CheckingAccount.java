package model;

public class CheckingAccount extends Account{


    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void printExtract() {
        System.out.println("=== Extract Checking Account===");
        super.printInfos();

    }
}
