package exception;

public class Null {
        public static void main(String[] args) {
            try {
                String name = null;
                System.out.println(name.length());  // Accessing null object
            } catch (NullPointerException e) {
                System.out.println("Error: Null object reference!");
            }
        }
    }


