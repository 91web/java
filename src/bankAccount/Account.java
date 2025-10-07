package bankAccount;

public class Account {
    private double balance;

    //constructor
    public Account(double balance) {
        this.balance = balance;
    }

    //getter
    public double getBalance() {
        return balance;
    }

    //setter
    public void setBalance(double balance) {
        this.balance = balance;
    }


    // Method deposit
    public void deposit(double amount) {
        if (amount >= 0) {
            setBalance(balance + amount);
        } else {
            System.out.println("Amount is less than Zero");
        }
    }
    // Method withdraw
    public void withDraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient fund");
        } else if (amount < 0) {
            System.out.println("Amount must be greater than 0, You cannot withdraw less than Zero Amount");
        } else {
            setBalance(balance - amount);
        }

    }
}
