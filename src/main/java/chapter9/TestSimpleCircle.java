package chapter9;

import java.util.Scanner;

/**
 * Created by rajanishivarajmaski1 on 3/17/17.
 */
public class TestSimpleCircle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int radius1 = scanner.nextInt();
        SimpleCircle simpleCircle = new SimpleCircle(radius1);
        double area = simpleCircle.computeArea();
        double perimeter = simpleCircle.computePerimeter();
        System.out.println("area: "+ area + " perimeter: " + perimeter);

        int radius2 = scanner.nextInt();
        SimpleCircle simpleCircle2 = new SimpleCircle(radius2);
       double area2 =  simpleCircle2.computeArea();
        double  perimeter2= simpleCircle2.computePerimeter();
        System.out.println("area: "+ area2 + " perimeter: " + perimeter2);

        int radius3 = scanner.nextInt();
        SimpleCircle simpleCircle3 = new SimpleCircle(radius3);
        double area3 =  simpleCircle2.computeArea();
        double  perimeter3= simpleCircle2.computePerimeter();
        System.out.println("area: "+ area3 + " perimeter: " + perimeter3);



    }
}
