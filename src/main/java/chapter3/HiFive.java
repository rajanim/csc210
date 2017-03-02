package chapter3;

import java.util.Scanner;

/**
 * Created by rajanishivarajmaski1 on 2/5/17.
 */
public class HiFive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reminder = number%5;
        //System.out.println(reminder);
        if(reminder!=0){
            System.out.println("Not divisble by 5");
        }else if(reminder==0){
            System.out.println("HiFive");
        }
        else {

        }
    }
}

