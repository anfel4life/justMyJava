import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by misha on 29.01.17.
 */
public class UnicChars {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type some string: ");
        String str = reader.readLine();
        System.out.print(charsNum(str));
    }
    public static int charsNum(String str){
        int count = str.length();
        for (int i = 0; i < str.length();i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count = count - 1;
                }
            }
        }
        return count;
    }
}