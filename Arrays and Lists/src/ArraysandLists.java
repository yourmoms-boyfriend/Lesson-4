import java.util.ArrayList;

public class ArraysandLists {
    
    public static void main(String[] args){
        //Create a new int array of size 5
        int[] numberArray = new int[5];
        //Create a new int String array of size 5
        String[] stringArray = new String[5];

        // how you can make a new array of any data type
        // Datatype[] nameOfArray = new Datatype [size of array you want];
        for (int i = 0; i <numberArray.length; i++){
            // filling the number array with a random number between 1 - 10
            numberArray[i] = (int) Math.random() * 10 + 1;
            System.out.println(numberArray[i]);

            // an easier way to populate an array is like to
            numberArray[0] = 90;
            numberArray[1] = 100;
            numberArray[2] = 100000;

            // number array look like this
            // numberArray
            // 0. 1
            // 1. 2
            // 2. 3
            // too lazy to write

            // access specific items on this list like so.
            System.out.println(numberArray[3]);

        
        }
        
        //there are cool things called arraylists which are 
        ArrayList<String> stringArrayList = new ArrayList<>();

        // arraylists compared to built in arrays have unlimited size
        
        // we can add to an arraylist like so
        stringArrayList.add("hello");
        stringArrayList.add("ur mom");
        stringArrayList.add("doesn't love you <3");

        // we can use a 

        for (int i = 0; i < stringArrayList.size(); i++){
            System.out.println(stringArrayList.get(i));
        }
    }
}
