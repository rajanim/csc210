package others;

/**
 * Created by rajanishivarajmaski1 on 4/17/17.
 */
public class Circle {

 int radius;


     Circle(int radius){
        this.radius = radius;
    }

    double getArea(){

        return radius*radius*Math.PI;

    }


    void setRadius(int newRadius){

        this.radius = newRadius;
    }

}
