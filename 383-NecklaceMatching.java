public class Main
{
	public static void main(String[] args) {
        System.out.println(repeats("abc"));
        System.out.println(same_necklace("nicole", "lenico"));
	}
	
	// BONUS
	public static int repeats(String str){
	    String originalStr = str;
	    int repeats = 0;
	    
	    for (int i=0; i<str.length(); i++){
	       str = modify(str);
	       if (str.equals(originalStr)){
	           repeats++;
	       }
	    }
	   
	    return repeats;
	}
	
	public static String modify(String str){
	    char[] strArray = str.toCharArray();
	    char temp = strArray[0];
	    
	    for (int i=1; i<str.length(); i++){
	        strArray[i-1] = strArray[i];
	    }
	    
	    strArray[strArray.length - 1] = temp;
        
        String newStr = new String(strArray);
        return newStr;
	}
	
	public static boolean same_necklace(String str1, String str2){
	   
	   for (int i=0; i<str1.length(); i++){
	       
	       str1 = modify(str1);
	       if (str1.equals(str2)){
	           return true;
	       }
	   }
	   return false;
	  
	}
}
