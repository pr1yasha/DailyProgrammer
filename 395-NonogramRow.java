import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
	    int[] array = {0,1,1,1,1,1,0,1,1,1,1};
	    nonogramrow(array);
	}
	
	public static ArrayList<Integer> nonogramrow(int[] array){
	    int total = 0;
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    
	    for (int i=0; i<array.length; i++){
	        if (array[i] == 1){
	            System.out.println("Match: " + i);
	            total += 1;
	        }
	        if (array[i] == 0 || i == array.length - 1){
	            if (total != 0){
	               list.add(total);
	            }
	            total = 0;
	        }
	    }
	    return list;
	}
}
