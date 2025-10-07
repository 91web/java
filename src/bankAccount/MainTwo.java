package bankAccount;

public class MainTwo {
    public static  void main(String[] arg){
        Account acct = new Account(100.00);

        double deposit = 20;
        acct.deposit(deposit);

        System.out.println("You have successfully deposited " + deposit + " balance is " + acct.getBalance());
    }
}
