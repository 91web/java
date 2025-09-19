package javaIntro;

import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("You entered: " + num);

        input.nextLine();
        // Ask user for input
        System.out.print("Enter your name: ");
        String name = input.nextLine();   // Read input as text

        System.out.print("Enter your age: ");
        int age = input.nextInt();        // Read input as number

        // Print the results
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");

    }
}
