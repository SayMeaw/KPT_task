import java.util.Scanner;
public class KPT_task12 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int max = -32768;
        int min = 32768;
        System.out.println("Введите количество чисел в массиве:");
        int x = in.nextInt();
        int [] array = new int[x];
        for (int i = 0; i < x; i++){
            System.out.println ("введите элемент " + i + " данного массива");
            array[i] = in.nextInt();
            if (array[i] < min){
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        int raz = 0;
        if (min >= 0 && max >= 0)
            raz = max - min;
        else if (min < 0 && max >= 0)
            raz = Math.abs(min) + max;
        else if (min < 0 && max < 0)
            raz = Math.abs(min) - Math.abs(max);

        System.out.println("Самое большое число в массиве = " + max + "\n" + "Самое маленькое число в массиве = " + min + "\n" + "Разница между самым большим и маленьким числом составляет: " + raz);
    }
}
