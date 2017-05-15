package chapter9;

/**
 * Created by rajanishivarajmaski1 on 3/29/17.
 */
public class TestTV {

    public static void main(String[] args) {

        TV tv1 = new TV();

        System.out.println(tv1.volumeLevel);

        TV tv2 = new TV(7, 10, true);

        System.out.println(tv2.channel);

        System.out.println("channel set to 9");

        tv2.setChannel(9);

        System.out.println(tv2.channel);

        tv2.volumeUp();
        System.out.println(tv2.volumeLevel);


    }
}
