import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

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

    public static int charsNum(String str) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        int count = 0;
        for (Map.Entry<String, Integer> pair : result.entrySet()) {
            if (pair.getKey().equals(str)) {
                count = pair.getValue();
            } else {
                for (int i = 0; i < str.length(); i++) {
                    for (int j = i + 1; j < str.length(); j++) {
                        if (str.charAt(i) != str.charAt(j)) {
                            count++;
                        }
                    }
                }
                result.put(str, count);
            }
        }
        return count;
    }
}
