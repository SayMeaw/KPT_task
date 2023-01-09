import java.util.Scanner;

public class KPT_task5 {
    public static void main (String[] args) {

        Scanner num = new Scanner(System.in);
        int a, b, N;
        System.out.println("Введите a: ");
        a = num.nextInt();
        System.out.println("Введите b: ");
        b = num.nextInt();
        System.out.println("Введите N: ");
        N = num.nextInt();

        if ((a + b) == N) {
            System.out.println("Сложение");
        } else if ((a - b) == N) {
            System.out.println("Вычитание");
        } else if ((a * b) == N) {
            System.out.println("Умножение");
        } else if ((a / b) == N){
            System.out.println("Деление");
        }   else {
            System.out.println("none");
        }
    }

}
