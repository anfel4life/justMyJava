import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by misha on 29.01.17.
 */
public class UnicChars {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Type some string: ");
            String str = reader.readLine();
            System.out.println(charsNum(str));
        }
    }
    public static long charsNum(String str) {
        HashMap<String, Integer> result = new HashMap<>();
        long count = 0;
        if(!result.containsKey(str)) {
            count = str.chars().distinct().count();
        }
        else if(result.containsKey(str)){
            Set<Map.Entry<String, Integer>> set = result.entrySet();
            for (Map.Entry<String, Integer> me : set){
                count = me.getValue();
            }
        }
        return count;
    }
}
