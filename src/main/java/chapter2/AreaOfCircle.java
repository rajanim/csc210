package chapter2;

import java.util.Scanner;

/**
 * Created by rajanishivarajmaski1 on 1/30/17.
 */
public class AreaOfCircle {

    public static void main(String[] args) {
        //create scanner instance that polls console
        Scanner scanner = new Scanner(System.in);
        //obtain the radius entered into console
        int radius = scanner.nextInt();

            //Validate input radius
            if(radius<=0) {
                System.err.print("Incorrect input");
            }
            else{
                //calculate area and assign to "area" variable
                double area = radius * radius * Math.PI;
                //print value in "area" variable
                System.out.println(area);
            }
    }
}
