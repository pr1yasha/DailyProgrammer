import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String args[]) {
        ArrayList<Integer> numArray = new ArrayList<Integer>(Arrays.asList(0, 3, 1, 2, 9, 8, 6, 5, 4));
        pancakeSort(numArray);
    }
    
    // CHALLENGE 
    public static void pancakeSort(ArrayList<Integer> numArray){
        ArrayList<Integer> tempArray = new ArrayList<Integer>();
        while (numArray.size() > 0){
            int max = Collections.max(numArray);
            numArray = flipfront(numArray, numArray.indexOf(max) + 1);
            numArray = flipfront(numArray, numArray.size());
            tempArray.add(numArray.size() - 1);
            numArray.remove(numArray.size() - 1);
        }
        tempArray = flipfront(tempArray, tempArray.size());
        for (int i=0; i<tempArray.size(); i++){
            System.out.print(tempArray.get(i) + " ");
        }
    }

    // WARM UP
    public static ArrayList<Integer> flipfront(ArrayList<Integer> numArray, int numSorted){
        for (int i=0; i < numSorted/2; i++){
            int temp = numArray.get(i);
            numArray.set(i, numArray.get(numSorted-1-i));
            numArray.set(numSorted-1-i, temp);
        }
        return numArray;
    }

}
