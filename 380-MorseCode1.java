import java.util.*;
import java.lang.String;

public class Main
{
	public static void main(String[] args) {
	    smorse("sos");
	}
	
	public static void smorse(String str){
	    
	    String[] morseCodeArray = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
    "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
    "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
    "-.--", "--.."};
    
        for (char c : str.toCharArray()) {
            System.out.print(morseCodeArray[charValue(c)] + " ");
        }
	}
	    
	    
	public static int charValue(char c) {
        int charVal = (int) c - 97;
        return charVal;
    }
	}
	
	

