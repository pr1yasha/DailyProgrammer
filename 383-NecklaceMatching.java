public class Main
{
	public static void main(String[] args) {
System.out.println(same_necklace("abc", "cba"));

	}
	
	public static String modify(String str1){
	    char[] strArray = str1.toCharArray();
	    char temp = strArray[0];
	    
	    for (int i=1; i<str1.length(); i++){
	        strArray[i-1] = strArray[i];
	    }
	    
	    strArray[strArray.length - 1] = temp;
        
        String newStr1 = new String(strArray);
        return newStr1;
	}
	
	public static boolean same_necklace(String str1, String str2){
	   char[] strArray = str1.toCharArray();
	   if (str1 == str2){
	       return true;
	   }
	   
	   for (int i=0; i<str1.length(); i++){
	       
	       str1 = modify(str1);
	       if (str1.equals(str2)){
	           return true;
	       }
	   }
	   return false;
	  
	}
}
