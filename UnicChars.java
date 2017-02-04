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
        HashMap<String, Long> result = new HashMap<>();
        long count = 0;
        if(!result.containsKey(str)) {
            count = str.chars().distinct().count();
            result.put(str, count);
        }
        else if(result.containsKey(str)){
            Set<Map.Entry<String, Long>> set = result.entrySet();
            for (Map.Entry<String, Long> me : set){
                count = me.getValue();
            }
        }
        return count;
    }
}
