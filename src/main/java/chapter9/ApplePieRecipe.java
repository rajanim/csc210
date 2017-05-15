package chapter9;

/**
 * Created by rajanishivarajmaski1 on 3/27/17.
 */
public class ApplePieRecipe {
    
    int sugarQty;
    int milkQty;
    int flour;
    int numApples;
    int numPies;


    public ApplePieRecipe(int sugarQty, int milkQty, int flour, int numApples, int numPies){
        this.sugarQty = sugarQty;
        this.milkQty = milkQty;
        this.flour = flour;
        this.numApples = numApples;
        this.numPies = numPies;

    }
    public void preparePie(){
        
        boilMilk(milkQty);

        String dough = makeDough(milkQty, sugarQty, flour, numApples);

        this.numPies =  makePies(dough, numApples, numPies);


    }
    private int makePies(String dough, int numPies, int numApples) {
       return splitDough(dough, numPies, numApples);
    }
    private int splitDough(String dough, int numPies, int  numApples) {
        return numApples/numPies;
        //pieces of dough broken into num pies
    }

    private String makeDough(int milkQty, int sugarQty, int flour, int apples) {
        return "done";
    }

    private void boilMilk( int milkQty) {
        //boil milk at certain temp
        int temp = 10;



    }

    public int getNumberOfPies() {
        return numPies;
    }
}
