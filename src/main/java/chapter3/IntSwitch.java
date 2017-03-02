package chapter3;

/**
 * Created by rajanishivarajmaski1 on 2/9/17.
 */
public class IntSwitch {
    public static void main(String[] args) {

        int numberOfPlayers = 6;
        String sport = null;

        switch (numberOfPlayers) {
            case 1:
                sport = "tennis";
                break;
            case 6:
                sport = "volleyball";
                break;
            case 9:
                sport = "baseball";
                break;
            default:
                sport = "redrover";
                break;
        }
        System.out.println("You're playing " + sport);

    }




}
