import java.util.Scanner;

public class KPT_task4 {
    public static void main (String[] args){

        Scanner num = new Scanner (System.in);
        float prob, prize, pay, x;
        System.out.println("Введите аргумент prob: ");
        prob = num.nextFloat();
        System.out.println("введите аргумент prize: ");
        prize = num.nextFloat();
        System.out.println("Введите аргумент pay: ");
        pay = num.nextFloat();
        x = prob * prize;
        boolean d = (x>pay);
        System.out.println(d);
        }


    }



