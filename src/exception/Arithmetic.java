package exception;

public class Arithmetic {

        public static void main(String[] args) {
            //Occurs when performing invalid arithmetic operations, such as dividing by zero.
            try {
                int result = 10 / 0;  // Division by zero
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero!" + e.getMessage());
            }
        }
    }


