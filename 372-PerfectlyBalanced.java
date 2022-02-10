import java.lang.String;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    System.out.println(balanced("fdedfdeffeddefeeeefddf"));
	}
	
	public static boolean balanced(String str){
	    char[] ch = str.toCharArray();
	    
	    HashMap<Character,Integer> frequencies = new HashMap<Character,Integer>();

	    for (int i=0; i<str.length(); i++){
	        if (frequencies.containsKey(ch[i]) == false){
	            frequencies.put(ch[i], 1);
	        }
	        else {
	            frequencies.computeIfPresent(ch[i], (k, v) -> v + 1);
	        }
	    }
	     
	    int first_value = frequencies.get(frequencies.keySet().toArray()[0]);
 
	    for (Map.Entry<Character, Integer> cursor : frequencies.entrySet()){
            if (cursor.getValue() != first_value){
                return false;
            }
        }
        
        return true;
	}
	
}
