package chapter3;

import java.util.Scanner;

/**
 * Created by rajanishivarajmaski1 on 2/5/17.
 */
public class AdditionQuiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("What do you think is the sum of these two numbers? ");
        int enteredSum = input.nextInt();

        //calculate sum using java addition
        int sum = num1+num2;

        //compare if both are same or otherwise
        if(enteredSum==sum){
            System.out.println("you are right, sum is: " + sum);
        }else{
            System.out.println("Sorry, our calculation do not match");
        }

    }
}
