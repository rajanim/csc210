package chapter9;

/**
 * Created by rajanishivarajmaski1 on 3/27/17.
 */
public class MakePie {

    public static void main(String[] args) {

        ApplePieRecipe applePieRecipe = new ApplePieRecipe(10,5,5,5,10);
        applePieRecipe.preparePie();

       int numPies =  applePieRecipe.getNumberOfPies();

        System.out.println(numPies);

    }
}
