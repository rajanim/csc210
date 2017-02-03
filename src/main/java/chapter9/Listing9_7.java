package chapter9;

/**
 * Created by rajanishivarajmaski1 on 1/28/17.
 */
public class Listing9_7 {

    /**
     * Main method
     */
    public static void main(String[] args) {
        CircleWithStaticMembers c1 = new CircleWithStaticMembers();
        System.out.println("c1: radius (" + c1.radius +
                ") and number of Circle objects (" + c1.numberOfObjects + ")");

        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5); // Modify c1
        c1.radius = 9;
        // Display c1 and c2 AFTER c2 was created
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius +
                ") and number of Circle objects (" +
                c1.numberOfObjects + ")");
        System.out.println("c2: radius (" + c2.radius +
                ") and number of Circle objects (" + c2.numberOfObjects + ")");
    }
}

class CircleWithStaticMembers {
    double radius;
    static int numberOfObjects =0;


    CircleWithStaticMembers(){
        radius=1;
        numberOfObjects++;
    }

    CircleWithStaticMembers(int radius){
        this.radius=radius;
        numberOfObjects++;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }
    double getArea(){
        return radius*radius* Math.PI;
    }

    }