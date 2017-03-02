package chapter5;

public class MultiplyTable {
    public static void main(String[] args) {

        System.out.println("Tables 2 and 3");

        for (int i = 2; i < 5; i++) {

            for (int j = 1; j <= 10 ; j++) {

                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}
