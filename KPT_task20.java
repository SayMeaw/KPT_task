import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class KPT_task20 {
    public static void main(String[] args) {

        System.out.println(boxSeq(5));
    }
    public static int boxSeq(int a)
    {
        int boxcount = 0;
        for (int i = 1 ; i<=a;i++)
            if(i%2 == 1)
                boxcount +=3;
            else boxcount--;
        return boxcount;
    }

}