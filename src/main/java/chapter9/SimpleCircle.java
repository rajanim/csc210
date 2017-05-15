package chapter9;

/**
 * Created by rajanishivarajmaski1 on 3/17/17.
 */
public class SimpleCircle {

    double radius;


    SimpleCircle() {
        radius = 1;
    }

    SimpleCircle(int newRadius) {

        this.radius = newRadius;
    }


    double computeArea() {
        double area = radius * radius * Math.PI;
        return area;
    }

    double computePerimeter() {
        double perimeter = 2 * radius * Math.PI;
        return perimeter;
    }



}
