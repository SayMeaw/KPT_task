import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class KPT_task14 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        System.out.println(cumulativeSum(arr1));
    }

    public static List<String> cumulativeSum(int[] arr) {
        List<String> sumArr = new ArrayList<String>();
        //int[] sumArr ={};
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
            String s = "" + sum;
            sumArr.add(s);
        }
        return sumArr;
    }

}