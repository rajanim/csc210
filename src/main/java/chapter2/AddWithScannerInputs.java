package chapter2;

import java.util.Scanner;

public class AddWithScannerInputs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter two numbers");

        double a =  scanner.nextInt();
        double b = scanner.nextDouble();

        double sum = a + b;
        System.out.println(sum);

        String inputString = scanner.next();
        System.out.println(inputString);

    }
}
