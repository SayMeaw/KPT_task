import java.util.Scanner;

public class KPT_task8 {
    public static void main(String [] args){
        int a,b;
        Scanner num = new Scanner(System.in);
        System.out.println("Введите первое ребро треугольника: ");
        a = num.nextInt();
        System.out.println("Введите второе ребро треугольника: ");
        b = num.nextInt();
        if (a<= 0 || b <= 0){
            System.out.println("Ошибка");
            return;
        }
        int max = a + b - 1;
        System.out.println("Максимальное значение для третеьего ребра = " + max);

    }
}
