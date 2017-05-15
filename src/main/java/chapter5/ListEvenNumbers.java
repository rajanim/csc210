package chapter5;

import java.util.Scanner;

public class ListEvenNumbers {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int limit = scanner.nextInt();

            for(int i=1; i <= limit; i++){

                if( i % 2 == 0){
                    System.out.print(i + " ");
                }
            }
        }

}
