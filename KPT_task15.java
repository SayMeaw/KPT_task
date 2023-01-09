import java.lang.reflect.Array;
import java.util.OptionalDouble;

public class KPT_task15 {
    public static void main(String[] args) {
        System.out.println(getdecimalPlaces("43.2021"));
    }

    public static int getdecimalPlaces(String num) {
        int counter = 0;
        boolean flag = false;
        for (int i = 0; i <= num.length() - 1; i++) {
            if (flag == true)
                counter++;
            if (num.charAt(i) == '.')
                flag = true;
        }
        return counter;
    }

}