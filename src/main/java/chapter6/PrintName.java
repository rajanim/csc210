package chapter6;

import java.util.Scanner;

public class PrintName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

       String ack =  printName(name);
        System.out.println(ack);

    }

    public static String printName(String name ){

        System.out.println("Hello " + name);

        return "printed";


    }
}
