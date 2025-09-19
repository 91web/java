package javaIntro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //code to print out largest Number between three numbers
        int x = 199;
        int y = 13;
        int z = 199;

        if (y>x && y>z)
            System.out.println("y is largest Number " + y);
        else if (z>x && z>y)
            System.out.println("z is largest Number " + z);
        else
            System.out.println("two number are equal either x, y or z");

        }
    }