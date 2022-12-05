package map;
import java.util.*;

public class Mapping {
    private static void creatMap(Map<String, Integer> map){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of words: ");
        String input = scanner.nextLine();

        String[] tokens = input.split(" ");

        for (String token : tokens){
            String word = token.toLowerCase();

            if(map.containsKey(word)){
                int count = map.get(word);
                map.put(word, count + 1);
            }
            else{
                map.put(word, 1);
            }
        }

    }

    private static void outputMap(Map<String, Integer> map){
        Set<String> keys = map.keySet();

        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("Keys\t\t\tValues%n");

        for ( String key : sortedKeys){
            System.out.printf("%-10s%10s%n", key, map.get(key));

        }
        System.out.printf("%nSize is: %d%nis empty: %b%n", map.size(), map.isEmpty());

    }

    public static void main(String[] args) {
        Map<String, Integer> theMap = new HashMap<>();
        creatMap(theMap);
        outputMap(theMap);
    }
}
