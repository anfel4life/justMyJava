import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by misha on 26.01.17.
 */
public class Sort {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[10];
        System.out.println("Type 10 digits: ");

        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sorted(array);

        for(int i : array){
            System.out.print(array[i]);
        }
    }

    public static void sorted(int[] array){
        for(int i = array.length - 1; i >= 0; i--){
            for(int j = 0; j < i; j++){
                if(array[j] > array[j + 1]){
                    int nums = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = nums;
                }
            }
        }
    }
}
