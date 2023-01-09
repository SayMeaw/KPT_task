import java.util.Scanner;

public class KPT_task13 {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Введите количество числел в массиве: ");
        int x = in.nextInt();
        int [] array = new int [x];
        int all = 0;
        for (int i = 0; i < array.length; i++){
            System.out.println("Введите " + i + " число массива: ");
            array[i] = in.nextInt();
            all+=array[i];
        }
        float sr = all / array.length;
        System.out.println(sr);
        if (sr > 0)
            System.out.println(true);
        else
            System.out.println(false);

    }
}
