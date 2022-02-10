import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(15, 18, 6, 13, 12, 4, 4, 14, 1, 6, 18, 2, 6, 16, 0, 9, 10, 7, 12, 3));
	    System.out.println(havelHakimi(numbers));
	}
	
	public static boolean havelHakimi(ArrayList<Integer> numbers){
	    while (numbers.size() >= 0){
    	    warmupOne(numbers);
    	    if (numbers.size() == 0){
    	        return true;
    	    }
    	    
    	    warmupTwo(numbers);
    	    int N = numbers.get(0);
    	    numbers.remove(0);
    	    if (warmupThree(N, numbers) == true){
    	        return false;
    	    }
    	    warmupFour(N, numbers);
	    }
	    return true;
	}
	
	public static void warmupFour(int N, ArrayList<Integer> numbers){
	    for (int i =0; i<N; i++){
	        numbers.set(i, numbers.get(i) - 1);
	    }
	}
	
	public static void warmupTwo(ArrayList<Integer> numbers){
	    Collections.sort(numbers);
        Collections.reverse(numbers);
	}
	
	public static boolean warmupThree(int N, ArrayList<Integer> numbers){
	    if (N>numbers.size()){
	        return true;
	    }
	    return false;
	}
	
	public static void warmupOne(ArrayList<Integer> numbers){
	    for (int i=0; i<numbers.size(); i++){
	        if (numbers.get(i) == 0){
	            numbers.remove(i);
	        }
	    }
	}
	
}
