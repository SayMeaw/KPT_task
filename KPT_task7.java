import java.util.Scanner;

public class KPT_task7 {
    public static void main (String[] args){

        Scanner num = new Scanner(System.in);
        int x, i, sum = 0;
        System.out.println("Введите число: ");
        x = num.nextInt();
        for (i = 1; i <= x; i++ ) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
