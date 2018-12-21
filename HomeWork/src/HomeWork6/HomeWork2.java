package HomeWork6;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(spaceDel(s));
    }

    public static String spaceDel(String s) {
        int i = 0;
        while (s.charAt(i) == ' ') {
            i++;
        }
        return s.substring(i);
    }
}
