package chapter5;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a letter
        System.out.print("Enter a string: ");
        String name = input.nextLine(); // diana


            int vowelCnt = 0;
        int constCnt = 0;

        name.toUpperCase();

        for(int i=0; i<name.length(); i++){

           if(name.charAt(i)=='A' || name.charAt(i)=='E' || name.charAt(i)=='I' || name.charAt(i)=='O' || name.charAt(i)=='U')
               vowelCnt++;
            else
                constCnt++;

        }



    }
}