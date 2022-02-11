import java.util.Random;
import java.util.Arrays;


public class Main
{
	public static void main(String[] args) {
		System.out.println(validate("0747532691"));
		printISBN(generateISBN());
	}
	
	// method to validate ISBN numbers
	public static boolean validate(String isbnNumber){
	    char[] numArray = isbnNumber.toCharArray();
	    int total = 0;
	    
	    for (int i=0; i<numArray.length; i++){
	        int x =  numArray[i] - 0;
	        total += (numArray.length - i) * x;
	    }
	    
	    if (total%11 == 0){
	        return true;
	    }
	    else {
	        return false;
	    }
	}
	
	public static void printISBN(int[] array){
	    for (int i=0; i<array.length; i++){
	        System.out.print(array[i]);
	    }
	}
	
	// method that generates a valid ISBN number.
	public static int[] generateISBN(){
	    int[] isbnCODE = new int[10];
	    Random generator = new Random();
	    
	    for (int i=0; i<9; i++){
	        int randomInt = generator.nextInt(10);
	        isbnCODE[i] = randomInt;
	    }
	    
	    for (int i=0; i<10; i++){
	        isbnCODE[9] = i;
	        if (validate(Arrays.toString(isbnCODE)) == true){
	            return isbnCODE;
	        }
	    }
	    return isbnCODE;
	}
	
}
