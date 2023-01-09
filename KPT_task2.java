import java.util.Scanner;
import java.lang.String;

public class KPT_task2 {
    public static void main (String[] args){
        Scanner num = new Scanner (System.in);
        int a, b, S;
        System.out.println ("введите основание: ");
        a = num.nextInt();
        System.out.println ("Введите высоту: ");
        b = num.nextInt();
        S = a * b / 2;
        System.out.println("Площадь треугольника = " + S);

    }

}
