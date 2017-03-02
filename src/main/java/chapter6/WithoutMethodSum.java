package chapter6;

/**
 * Created by rajanishivarajmaski1 on 2/27/17.
 */
public class WithoutMethodSum {

    public static void main(String[] args) {
        int a = 3;
        int b =10;

        int result = 0;
        for (int i = a; i <= b; i++) {
            result = result + i;
        }
        System.out.println(result);

        int a1=10;
        int b1=30;

        int result1 = 0;
        for (int i = a1; i <= b1; i++) {
            result1= result1 + i;
        }
        System.out.println(result1);
    }
}
