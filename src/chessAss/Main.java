package chessAss;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //import scanner for user input
        Scanner scanner = new Scanner(System.in);

        //print user instruction
        System.out.println("Input rows number: ");

        //take the row index
        int row = scanner.nextInt();

        //print user instruction
        System.out.println("Input columns number:  ");

        //take the row index
        int column = scanner.nextInt();


        // check to be sure the input are not zero

        if (row < 1 || column < 1) {
            System.out.println("Invalid input – both row and column must be > 0");
            return;
        }

        int[][] chessMatrix = new int[row][column];

        // fill & print chess array (0/1)
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                chessMatrix[i][j] = ((int) (Math.random() * 2)); // 0 or 1
                System.out.print(chessMatrix[i][j] + " ");
            }
            System.out.println();

        }
        scanner.close();
    }
}