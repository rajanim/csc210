package chapter7;

public class StringArrays {

    public static void main(String[] args) {
        // array of string consisting names. array size is 4
        //array index starts from zero, so it is 0 to 3
        String [] names = {"John", "Mary", "Adam", "Joel"};
        //method that checks if name exist at given index position
       String name =  nameAtIndex(names, 1);
        //print value returned from the above method
        System.out.println("name at position 1: " + name);

        name =  nameAtIndex(names, 5);
        System.out.println("name at position 5: " + name);
    }
    // method checks if the index position is within array bound.
    // In this case array bound is 0-3, so if index is less than 0 or greater than 3,
    //we return as name not in list
    private static String nameAtIndex(String[] names, int index) {
        String name;
       if(index>=0 && index< names.length) {
           name = names[index];
       }else{
           name = "Not in names list";
       }
       return name;
    }
}
