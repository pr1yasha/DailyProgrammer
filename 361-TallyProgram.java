import java.lang.String;
import java.util.*;

public class Main {
    public static void main(String[] args){
        HashMap<Character, Integer> scores = TallyProgram("dbbaCEDbdAacCEAadcB");
        HashMap<Character, Integer> temp = sortMap(scores);
        for (Map.Entry<Character, Integer> cursor : temp.entrySet()){
            System.out.print(cursor.getKey() + ": " + cursor.getValue() + " ");
        }
    }

    public static HashMap<Character, Integer> sortMap(HashMap<Character, Integer> scores){
        List<Map.Entry<Character, Integer> > list = new LinkedList<Map.Entry<Character, Integer> >(scores.entrySet());
        Collections.sort(list, (i2, i1) -> i1.getValue().compareTo(i2.getValue()));
        HashMap <Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> cursor : list) {
            temp.put(cursor.getKey(), cursor.getValue());
        }
        return temp;
    }

    public static HashMap TallyProgram(String str){
        HashMap<Character,Integer> scores = new HashMap<Character,Integer>();
        int n = str.length();
        for(int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (scores.containsKey(Character.toLowerCase(c)) == false){
                if (Character.isUpperCase(c)){
                    scores.put(Character.toLowerCase(c), -1);
                }
                else {
                    scores.put(Character.toLowerCase(c), 1);
                }
            }
            else {
                if (Character.isUpperCase(c)){
                    scores.computeIfPresent(Character.toLowerCase(c), (k, v) -> v - 1);
                }
                else {
                    scores.computeIfPresent(c, (k, v) -> v + 1);
                }
            }
        }
       return scores;
    }

}
