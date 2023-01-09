import java.util.Scanner;

public class KPT_task3 {
    public static void main (String [] args){
        Scanner num = new Scanner (System.in);
        int chickens, cows, pigs, all;
        System.out.println("Введите количество куриц: ");
        chickens = num.nextInt();
        System.out.println("Введите количество коров: ");
        cows = num.nextInt();
        System.out.println("Введите количество свиней: ");
        pigs = num.nextInt();
        all = chickens * 2 + cows * 4 + pigs * 4;
        System.out.println("Общее количество ног всех животных = " + all);

    }
}