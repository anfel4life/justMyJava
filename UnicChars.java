/**
 * Write a console application that takes a string and returns the number of unique characters in the string.
 * It is expected that a string with the same character sequence may be passed several times to the method.
 * Since the counting operation can be time consuming, the method should cache the results,
 * so that when the method is given a string previously encountered, it will simply retrieve the stored result.
 * Use collections and maps where appropriate.
 */

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
    static HashMap<String, Long> catcher = new HashMap<>();

    public static long charsNum(String str) {
        long count = 0;
        if(!catcher.containsKey(str)) {
            count = str.chars().distinct().count();
            catcher.put(str, count);
        }
        else if(catcher.containsKey(str)){
            Set<Map.Entry<String, Long>> set = catcher.entrySet();
            for (Map.Entry<String, Long> me : set){
                count = me.getValue();
            }
        }
        return count;
    }
}
