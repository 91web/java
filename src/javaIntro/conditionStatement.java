package javaIntro;

// Java Basics: Variables, Control Flow, Methods, Arrays, and Strings
public class conditionStatement {

    public static void main(String[] args) {
        // 1. Variables and Data Types
        System.out.println("--- Variables and Data Types ---");
        int integerVar = 10; // Integer
        double doubleVar = 3.14; // Double
        char charVar = 'A'; // Character
        boolean booleanVar = true; // Boolean
        String stringVar = "Hello, Java!"; // String

        System.out.println("Integer: " + integerVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Character: " + charVar);
        System.out.println("Boolean: " + booleanVar);
        System.out.println("String: " + stringVar);

        // 2. Operators
        System.out.println("\n--- Operators ---");
        int a = 5, b = 3;
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // 3. Control Flow
        System.out.println("\n--- Control Flow ---");
        // If-Else
        System.out.println("a is greater than b");

        // Switch
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Loops
        System.out.println("\n--- Loops ---");
        // For Loop
        System.out.println("For Loop:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteration: " + i);
        }

        // While Loop
        System.out.println("While Loop:");
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }

        // Do-While Loop
        System.out.println("Do-While Loop:");
        count = 0;
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count < 3);

        // 4. Methods & Parameters
        System.out.println("\n--- Methods & Parameters ---");
        int sum = addNumbers(5, 10);
        System.out.println("Sum: " + sum);

        // 5. Arrays
        System.out.println("\n--- Arrays ---");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array Elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 6. Strings
        System.out.println("\n--- Strings ---");
        String str1 = "Java";
        String str2 = "Programming";
        System.out.println("Concatenation: " + str1 + " " + str2);
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Substring: " + str2.substring(0, 4));
        System.out.println("Uppercase: " + str1.toUpperCase());
    }

    // Method to add two numbers
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
}
