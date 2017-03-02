package chapter3;

import java.util.Scanner;

/**
 * Created by rajanishivarajmaski1 on 2/8/17.
 */
public class BMI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight = scanner.nextDouble();

        double height = scanner.nextDouble();


        System.out.println( weight/ (height*height));
    }
}
