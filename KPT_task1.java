import java.util.Scanner;

public class KPT_task1 {
    public static void main (String[] args){
        Scanner num = new Scanner (System.in);
        int first, second, result;
        System.out.println ("Введите первое число: ");
        first = num.nextInt();
        System.out.println ("Введите второе число: ");
        second = num.nextInt();
        result = first % second;
        System.out.println ("Остаток от деления: " + result);



    }
}
