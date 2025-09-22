package bankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] transaction = {"Deposit", "Withdraw"};

        System.out.println("What do you want to do");
        Scanner scanner = new Scanner(System.in);
        // 1. show menu
        for (int i = 0; i < transaction.length; i++) {
            System.out.println((i + 1) + " to " + transaction[i]);
        }

        // 2. keep asking until we get a valid integer in range
        int choice;
        while (true) {
            System.out.print("Enter a number for your choice: ");
            if (!scanner.hasNextInt()) {          // non-integer typed
                System.out.println("Invalid choice – numbers only.");
                scanner.next();                   // discard the bad token
                continue;
            }

            choice = scanner.nextInt();
            if (choice < 1 || choice > transaction.length) {  // out of range
                System.out.println("Invalid choice – out of range.");
            } else {
                break;                              // good input → leave loop
            }
        }
        //Account
        Account acct = new Account(5000.44);

        int deposit = 0;
        int withDraw = 0;
        if (choice == 1) {
            System.out.println("Input Deposit Amount");
            deposit = scanner.nextInt();

        } else {
            System.out.println("Input Amount to Withdraw");
            withDraw = scanner.nextInt();
        }

        // 3. continue with transaction
        System.out.println("Transaction choice: " + transaction[choice - 1]);

        // Choice
        if (choice == 1 ) {
            double balance = acct.deposit(deposit);
            if (deposit > 0) {
                System.out.println("You have successfully deposited " + deposit + " balance is " + acct.getBalance());
            }  } else {
            double balance = acct.withDraw(withDraw);
            if (withDraw > 0) {
                System.out.println("You have successfully withdraw " + withDraw +  " balance is " + acct.getBalance());
            }  }
    }
}
