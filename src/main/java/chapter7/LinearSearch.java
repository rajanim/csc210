package chapter7;


public class LinearSearch {

    public static void main(String[] args) {
        //Declaring and creating an array with variable name 'list'
        int[] list = {10,20, 50,65,70};
        // searching for given key and obtaining index value
       int i =  linearSearchGetIndex(list, 20);
        //printing the obtained index position
        System.out.println("index position: " + i);

        int  j =  linearSearchGetIndex(list, 22);
        System.out.println("index position: " + j);

    }
    //method to search for key in given array and return its index position.
    //if key does not exist in array, we return -1
    private static int linearSearchGetIndex(int[] list, int key) {
        //loop through entire array and compare array elements with key
        for (int i = 0; i < list.length; i++) {
            // if key is equal to array element, key is found and we return that position
            if(key==list[i]){
                return i;
            }
        }
        //if key was not found, loop exits and that means key does not exist in array,
        // we return -1 (index position not found)
        // Note that index position always starts from 0
        return -1;
    }

}
