package chapter2;

/**
 * Created by rajanishivarajmaski1 on 2/1/17.
 */
public class Cylinder {

    public static void main(String[] args) {

        int radius = 10; int length = 2;
        double pi = 3.14;

        double  area = radius * radius * pi;

        System.out.println("Area of cylinder: ");
        System.out.println(area);

        double volume = area * length;

        System.out.println("Volume of cylinder: ");
        System.out.println(volume);

    }
}
