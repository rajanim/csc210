package chapter6.part2;

import java.util.Scanner;

/* *  1 : add numbers(a,b)
         *  2 : subtract  (a,b)
         *  3 : multiply (a,b)
         *  4 : divide (a,b) // if b = 0 print invalid*/
public class Calculator {

    public static void main(String[] args) {
        // take user input for option
        //take user input for a and b
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //calling method to calculate
       int output =  calculate(option, a , b);
        System.out.println("option selected: " + option + "\n"+ output);


    }
    public static int calculate(int option, int a, int b){
        int output;
        switch (option){

            case 1 : output = a + b; break;
            case 2 :
            case 3 :
            case 4 :
                default: output=0;
        }
        return output;
    }
}

