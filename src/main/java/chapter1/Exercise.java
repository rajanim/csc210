package chapter1;

/**
 * Created by rajanishivarajmaski1 on 1/27/17.
 */
public class Exercise {


    //PROGRAMMING EXERCISES
    public static void main(String[] args) {
        //1.1
        System.out.println("Welcome to Java\n" + "Welcome to Computer Science\n" +  "Programming is fun");
        //1.3
        System.out.println("J    A   V     V    A  ");
        System.out.println("J   A A   V   V    A A ");
        System.out.println("J  AAAAA   V V    AAAAA ");
        System.out.println("J  A    A   V    A     A");

        //1.4
        for(int i=1; i<=4; i++)
            System.out.println(i +"\t"+ i*i +"\t"+ i*i*i);

        //1.5
        System.out.println((9.5 * 4.5 - 2.5 * 3) /(45.5 - 3.5));

        //1.6
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);

        //1.7 todo
        //1.8
        double radius = 5.5; double perimeter=2 * radius * 3.142;
        System.out.println(perimeter);
        System.out.println(radius * radius * perimeter);

        //1.9
        double width = 4.5, height = 7.9;
        System.out.println("area: " + width * height);

        //1.11 todo
        //1.12
        int timeInHour = 1+(40/60)+(35*60)/60;
        double avgSpeed = (24*1.6)/timeInHour;
        System.out.println(avgSpeed);

        //1.13 todo


    }


}
