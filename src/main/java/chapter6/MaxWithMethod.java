package chapter6;

import java.util.Scanner;


public class MaxWithMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("max of a and b: " + "(" + a +"," + b + ") "  + maximum(a,b));
    }

    public static int maximum(int a, int b){
     int max;

        if(a>b)
            max = a;

        else
           max =b;

        return  max;

    }
}
