import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class KPT_task19 {
    public static void main(String[] args) {

        System.out.println(isSuffix("repotrinator", "inator"));
        System.out.println(isPrefix("automation", "auto"));
    }

    public static boolean isSuffix(String str, String pref) {
        String test = str.substring(str.length() - pref.length());
        if (pref.equals(str.substring(str.length() - pref.length())))
            return true;
        else return false;
    }

    public static boolean isPrefix(String str, String pref) {
        String test = str.substring(pref.length());
        if (pref.equals(str.substring(0, pref.length())))
            return true;
        else return false;
    }

}