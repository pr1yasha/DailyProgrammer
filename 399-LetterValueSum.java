import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int oddSum = 0;
        String special_word = null;
        File file = new File("C:\Users\user\Desktop\DailyProgrammer\enable1.txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()) {
            String str = scan.nextLine();
            if (lettersum(str) == 319){
                special_word = str;
            }
            if (lettersum(str) % 2 == 1){
                oddSum ++;
            }
            System.out.println(str);
        }
        System.out.println("Answer to challenge one is " + special_word);
        System.out.println("Answer to challenge two is " + oddSum);
    }

    public static int lettersum(String str) {
        int sum = 0;
        int charVal;
        for (char c : str.toCharArray()) {
            charVal = (int) c - 96;
            sum += charVal;
        }
        return sum;
    }

}
