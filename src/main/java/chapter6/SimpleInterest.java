package chapter6;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        // to read from console
        Scanner scanner = new Scanner(System.in);
        // reads p from console and assigns to 'p' variable
        double p = scanner.nextDouble();
        int t = scanner.nextInt();
        double r = scanner.nextInt();

        // calling computeSimpleInterest method
        double si  = computeSimpleInterest(p, t, r);
        System.out.println("Simple Interest: " + si);

        //compute compound interest
        double ci = computeCompoundInterest();

        double sumSiCi = si+ci;

        System.out.println(sumSiCi);

    }
    /**
     * method defintion to compute compound interest.
     * @return
     */
    private static double computeCompoundInterest() {

        return  1.1;
    }

    //computeSimpleInterest definition
    public  static double computeSimpleInterest( double p , int t, double r){

        double si = (p*t*r)/100;
        return  si;

    }

}
