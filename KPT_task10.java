import java.util.Scanner;

public class KPT_task10 {
    public static void main (String[] args){
        int a,b,c,sum=0;
        Scanner in = new Scanner (System.in);
        System.out.println("Введите a: ");
        a = in.nextInt();
        System.out.println("Введите b: ");
        b = in.nextInt();
        System.out.println("Введите c: ");
        c = in.nextInt();
        for(int i=0; i<b; i++){
            a+=a;
        }
        System.out.println("Результат сложения: " + a);
        if (a % c ==0)
            System.out.println("Число делится на c без остатка");
        else
            System.out.println("Число не делится на c");
    }
}
