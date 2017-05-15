package chapter6.part2;

import java.util.Scanner;


public class AreaCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        int value = scanner.nextInt();
        double area = computeArea(option, value);
        System.out.println("area: " + area);

    }
    private static double computeArea(int option, int value) {
        double area;
       /* switch (option){
            case 0 : area = computeAreaOfCircle(value);break;
            case 1 : area = computerAreaOfSquare(value);break;
            default: area = 0.0; break;
        }*/

        switch (option){
            case 0 : area = value*value;break;
            case 1 : area = Math.PI * value*value;break;
            default: area = 0.0; break;
        }
        return  area;
    }

    public static double computerAreaOfSquare(int value) {

        return  value*value;
    }

    public static double computeAreaOfCircle(int value) {
            double area = Math.PI * value*value;
        return  area;
    }

}
