import java.util.Scanner;

public class KPT_task11 {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        System.out.println("введите строку: ");
        String abc = in.nextLine();
        System.out.println("введите n: ");
        int n = in.nextInt();
        StringBuilder repeat = new StringBuilder();
        for (int i = 0; i < abc.length(); i++){
            for (int j = 0; j<n; j++){
                repeat.append(abc.charAt(i));
            }
        }
        System.out.println(repeat);



    }
}
