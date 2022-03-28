package model;

public abstract class Account implements AccountInterface{

    private static final int STANDARD_AGENCY =1;
    private static int SEQUENTIAL = 1;

    protected int agency;
    protected int number;
    protected double balance ;
    protected Client client;

    public Account(Client client){
        this.agency =STANDARD_AGENCY;
        this.number = SEQUENTIAL++;
        this.client = client;
    }

    @Override
    public void withdraw(double value) {
        balance-= value ;
    }

    @Override
    public void deposit(double value) {
        balance+= value;
    }

    @Override
    public void transfer(double value, Account destinationAccount) {
        this.withdraw(value);
        destinationAccount.deposit(value);
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
    protected void printInfos(){
        System.out.println(String.format("Client: %s", this.client.getName()));
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Number: %d", this.number));
        System.out.println(String.format("Balance: %.2f", this.balance));
    }
}
