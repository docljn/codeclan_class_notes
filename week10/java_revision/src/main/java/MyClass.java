import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyClass {

    public static boolean contains(int[] array, int item){
        for (int n:array){
            if (n == item){
                return true;
            }
        }
        return false;
    }

    public static int getSmallestInteger(int[] array) {
        int smallest = 1;

        if (array == null) return 1;

        Arrays.sort(array);
        if (array.length < 1){
            return smallest;
        }

        if (array[array.length -1] < 1){
            return smallest;
        }


        for (int n = 1; n <= 100001; n++){
            if (!contains(array, n)){
                return n;
            }
        }
        return smallest;
    }
}
