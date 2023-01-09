import java.util.Scanner;

public class KPT_task9 {
    public static void main (String[] args){
        int[] mass;
        int sum = 0, k;
        Scanner in = new Scanner (System.in);
        System.out.println("Введите количество числе в массиве: ");
        k = in.nextInt();
        mass = new int [k];
        System.out.println("Введите числа в массив: ");
        for (int i=0; i<k; i++){
            mass[i] = in.nextInt();
            int x = mass[i] * mass[i] * mass[i];
            sum+=x;
        }
        System.out.println ("Сумма кубов = " + sum);

    }
}
