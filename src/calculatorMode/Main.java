package calculatorMode;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] operators = {"addition", "subtraction", "division", "multiplication", "power 2", "square root"};


        System.out.println(" What do you want to do?");
        Scanner scanner = new Scanner(System.in);

        // 1. show menu
        for (int i = 0; i < operators.length; i++) {
            System.out.println((i + 1) + " to " + operators[i]);
        }

        // 2. keep asking until we get a valid integer in range
        int choice;
        while (true) {
            System.out.print("Enter your choice: ");
            if (!scanner.hasNextInt()) {          // non-integer typed
                System.out.println("Invalid choice – numbers only.");
                scanner.next();                   // discard the bad token
                continue;
            }

            choice = scanner.nextInt();
            if (choice < 1 || choice > operators.length) {  // out of range
                System.out.println("Invalid choice – out of range.");
            } else {
                break;                              // good input → leave loop
            }
        }
        int num1=0;
        int num2=0;
        if (choice==1 || choice==2|| choice==3||choice==4) {
            System.out.println("input values for num1");
            num1 = scanner.nextInt();

            System.out.println("input values for num2");
            num2 = scanner.nextInt();
        }else {
            System.out.println("input values for num1");
            num1 = scanner.nextInt();
        }

        // 3. continue with real work
        System.out.println("You picked: " + operators[choice - 1]);

        Calc calculator = new Calc();
        if ( choice == 1){

            int addition = calculator.add(num1, num2);
            System.out.println("The sum of "+ num1 +" and " + num2 + " is " + addition);
        }
        else if ( choice == 2){
            int substraction = calculator.sub(num1,num2);
            System.out.println("The subtraction of "+ num1 +" and " + num2 + " is " + substraction);
        }
        else if (choice == 3){
            double division = calculator.div(num1,num2);
            System.out.println("The division of "+ num1 +" by " + num2 + " is " + division);
        }
        else if (choice == 4){
            double multiply = calculator.multi(num1,num2);
            System.out.println("The multiplication of "+ num1 +" by " + num2 + " is " + multiply);
        }
        else if (choice == 5){
            double power = calculator.pow(num1);
            System.out.println("The power of "+ num1 +" by "+  2 + " is " + power);
        }
        else {
            double sqr = calculator.sqr(num1);
            System.out.println("The square root of "+ num1 + " is " + sqr);
        }
    }
}