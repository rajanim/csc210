package chapter7;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        //Declaring and creating array of size 5
        //int[] list = {20, 40, 60, 30, 90};
        //creating scanner object to read from console
        Scanner scanner = new Scanner(System.in);
        //declare and creating array
        int[] list= new int[5];
        System.out.print("Enter " + list.length + " values: ");

        //assign values to array from console/scanner
        for (int i = 0; i<list.length; i++) {
            list[i] = scanner.nextInt();
        }

        //calling method to obtain maximum number
    int largeNumber = largestNumber(list);
        //printing maximum number
        System.out.println("Largest number is: "  + largeNumber);

    }
//method definition to find maximum number
    public static int largestNumber(int[] list){
        //initially we are assuming zeroth element as maximum
        int max=list[0];
        //we compare each element in loop with max value and swap if its lower than
        //other array elements.
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        //returning the final maximum number
        return max;
    }
}
