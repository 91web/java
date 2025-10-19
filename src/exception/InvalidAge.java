package exception;

    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public class InvalidAge {
        static void checkAge(int age)
                throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above.");
            } else {
                System.out.println("Access granted!");
            }
        }

        public static void main(String[] args) {
            try {
                checkAge(155);
            } catch (InvalidAgeException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

