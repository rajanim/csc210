package chapter6.part2;

import java.util.Scanner;

public class Increment {

    public static void main(String[] args) {
        // scanner instance to read input number from console
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
            //calling method increaseNumber to increase number by 1
        int increased = increaseNumber(inputNumber);
        System.out.println(increased);

    }

    //method increases integer number by 1 and returns it to calling method.
    public static int increaseNumber(int inputNumber) {
        inputNumber = inputNumber + 1;
        return inputNumber;

        //return inputNumber++;
    }
}
