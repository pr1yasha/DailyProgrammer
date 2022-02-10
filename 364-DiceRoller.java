import java.util.Random;

public class Main
{
	public static void main(String[] args) {
	    System.out.println(dice("5d12"));
	}
	    
	public static int dice(String str){
            String[] parts = str.split("d");
            String numberOfDice = parts[0]; 
            String diceSides = parts[1]; 
            
            Random ran = new Random();
            int totalSum = 0;
            
            for (int i=0; i< Integer.parseInt(numberOfDice); i++){
                totalSum += ran.nextInt(Integer.parseInt(diceSides)) + 1;
            }
   
            return totalSum;
	}  
  
}
