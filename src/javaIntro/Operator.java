package javaIntro;

public class Operator {
    public static void main(String[] args) {
        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        int a = 10, b = 5;
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus
        System.out.println("a++ = " + (a++)); // Increment (post-increment)
        System.out.println("--b = " + (--b)); // Decrement (pre-decrement)

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 10;
        c += 5; // Addition assignment
        System.out.println("c += 5: " + c);
        c -= 3; // Subtraction assignment
        System.out.println("c -= 3: " + c);
        c *= 2; // Multiplication assignment
        System.out.println("c *= 2: " + c);
        c /= 4; // Division assignment
        System.out.println("c /= 4: " + c);
        c %= 3; // Modulus assignment
        System.out.println("c %= 3: " + c);

        // Logical Operators
        System.out.println("\nLogical Operators:");
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT

        // Ternary Operator
        System.out.println("\nTernary Operator:");
        int result = (a > b) ? a : b; // Ternary operator
        System.out.println("Result: " + result);

        // Comparison Operators
        System.out.println("\nComparison Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int d = 5, e = 3;
        System.out.println("d & e: " + (d & e)); // Bitwise AND
        System.out.println("d | e: " + (d | e)); // Bitwise OR
        System.out.println("d ^ e: " + (d ^ e)); // Bitwise XOR
        System.out.println("~d: " + (~d)); // Bitwise NOT
    }
}
