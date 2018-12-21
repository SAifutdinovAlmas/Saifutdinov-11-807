package HomeWork5;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] array = s.toCharArray();
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            n = n*10 + array[i]-48;
        }
        System.out.println(n);
    }
}
