package chapter6;

import java.util.Scanner;


public class PatternPrint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();


        printPattern(rows, cols);
    }
    /**
     * Print pattern , nothing to return, so its 'void'
     * @param rows input
     * @param cols input
     */
    public static void printPattern(int rows, int cols) {
        // outer loops for rows
        for (int i = 0; i < rows ; i++) {
            //inner loops for columns
            for (int j = 0; j < cols ; j++) {
                System.out.print("*");
            }
            // prints a new line
            System.out.println();
        }
    }
}
