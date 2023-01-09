import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class KPT_task18 {
    public static void main(String[] args) {

        System.out.println(isStrangePair("radio", "operator"));
    }
    public static boolean isStrangePair(String str1, String str2) {
        if (str1.charAt(str1.length() - 1) == str2.charAt(0) && str2.charAt(str2.length() - 1) == str1.charAt(0))
            return true;
        else return false;
    }

}