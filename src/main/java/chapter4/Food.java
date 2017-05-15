package chapter4;

/**
 * Created by rajanishivarajmaski1 on 4/15/17.
 */
public class Food {

    private String name; // name of food
    private int calPerServing; // calories per serving // must be >= 0

    // min storage temperature // must be >= 0.
    // max storage temperature // must be <= 100.
    private float minTemp;
    private float maxTemp;

    int getCalories() {
        return
                calPerServing;
    }

    // TODO:  methods for the Food class that you will need // to fill in go here

   /* a)​ ​Write a constructor method for the Food class, to set the default name to "Pie", the default calPerServing to 500, the default minTemp to 25, and the default maxTemp to 75. Show the method header clearly.
    Write set and get methods for name, minTemp and maxTemp

    b) Fill in the set() method for the Food class, to set name to newName, calPerServing to newCal, minTemp to newMin, and maxTemp to newMax. You must check that newCal is >= 0, minTemp >= 0, and maxTemp <= 100. If either newCal, newMin or newMax is not in the correct range, print an error message and return immediately, without changing any of the member variables of the Food object.

*/

    void set(String newName, int newCal, float newMin, float newMax) {
    }


}

//  c)In the public class below, write Java statements to declare an object called myFavDish​ ​of the class Food, and set the name of myFavDish to “Gelato”, calPerServing to 400, minTemp to 0, maxTemp to 4.
// Print calories using getCalories.


class TestFoodClass {
    public static void main(String[] args) {


    }
}