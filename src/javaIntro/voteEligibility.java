package javaIntro;

import java.util.Scanner;

public class voteEligibility {
    public static void main(String[] args) {   Scanner input = new Scanner(System.in);
        System.out.print("Input your Age: ");
        int age = input.nextInt();

        if  (age >= 18) {
            System.out.println("You are a Eligible to Vote");
        }
            else{
                System.out.println("You are not a Eligible to Vote");
        }
    }
}
