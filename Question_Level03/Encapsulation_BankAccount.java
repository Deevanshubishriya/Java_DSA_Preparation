package Question_Level03;
/*
1. The Secure Bank Account:
Create a BankAccount class with private fields: accountNumber, accountHolderName, and balance.

Write a deposit(double amount) method that only accepts positive values.

Write a withdraw(double amount) method that prevents withdrawal if the amount is greater than the current balance or negative. Print appropriate error messages.
 */
public class Encapsulation_BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    public Encapsulation_BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (balance >= 0) {
            this.balance = balance;
        }
        else {
            System.out.println("error");
        }
    }
    public void deposit(double amount){
        if (amount > 0) {
            this.balance += amount;
            System.out.println("amount deposited" + amount);
            System.out.println("current balance" + this.balance);

        }
    }
    public void withdraw(double amount){
        if (amount <= 0) {
            System.out.println("error");

        }
        else{
            this.balance -= amount;
            System.out.println("withdrawn balance" + this.balance);
        }
    }
    public double getBalance(){
        return this.balance;
    }
    public static void main(String[] args) {
        Encapsulation_BankAccount pnb = new Encapsulation_BankAccount(101 , "deevanhu", 1000);
        pnb.deposit(1000);
        pnb.withdraw(200);
        pnb.getBalance();


    }
}
