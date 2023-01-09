import java.lang.reflect.Array;
import java.util.OptionalDouble;

public class KPT_task16 {
    public static void main(String[] args) {

        System.out.println(fibbonachi(12));
    }

    public static int fibbonachi(int n) {
        int ans = 1, prev = 0;
        for (int i = 1; i <= n; i++) {
            ans += prev;
            prev = ans - prev;
        }
        return ans;
    }

}
