import java.util.Scanner;

public class laba1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Введите слово для проверки:");
        String s = in.nextLine();
        if(isPalindress(s)==true)
            System.out.println(s + " - является палиндромом");
        else
            System.out.println(s + " - не является палиндромом");

    }
    //реверсит слово
    public static String reversing(String s){
        String s1 = "";
        for(int i = s.length() - 1; i >= 0 ; i--){
            s1 += s.charAt(i);
        }
        return s1;
    }
    //проверка на палиндром
    public static boolean isPalindress(String s){
        String s1 = reversing(s);
        if (s.equals(s1))
            return true;
        else
            return false;
    }
}
