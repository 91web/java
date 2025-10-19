package exception;

public class InvalidAgeInput {
    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
    public static class InvalidAge {
        static void checkAge(int age) throws exception.InvalidAgeException {
            if (age < 18) {
                throw new exception.InvalidAgeException("Age must be 18 or above.");
            } else {
                System.out.println("Access granted!");
            }
        }

        public static void main(String[] args) {
            try {
                checkAge(15);
            } catch (exception.InvalidAgeException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

}

