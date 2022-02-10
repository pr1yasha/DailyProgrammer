import java.util.*;
import java.lang.String;

public class Main
{
	public static void main(String[] args) {
	    int[] arr = {1654, 1654, 50995, 30864, 1654, 50995, 22747,
    1654, 1654, 1654, 1654, 1654, 30864, 4868, 1654, 4868, 1654,
    30864, 4868, 30864};
	    System.out.println(yahtzee_upper(arr));
	}
	
	public static int yahtzee_upper(int[] numbers){
	    HashMap<Integer,Integer> frequencies = new HashMap<Integer,Integer>();
	    
	    for (int i=0; i<numbers.length; i++){
	        if (frequencies.containsKey(numbers[i]) == false){
	            frequencies.put(numbers[i], numbers[i]);
	        }
	        
	        else {
	            int temp = numbers[i];
	            frequencies.computeIfPresent(temp, (k,v) -> v + temp);
	        }
	    }
	    
	    int max = 0;
        for (Map.Entry<Integer, Integer> cursor : frequencies.entrySet()){
            if (cursor.getValue() > max){
                max = cursor.getValue();
            }
        }
        
        return max;
	}
	
}
