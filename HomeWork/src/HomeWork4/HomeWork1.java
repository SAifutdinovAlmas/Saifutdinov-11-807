package HomeWork4;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s1 = "", s2 = "";
        for (int i = 0; i < n; i++) {
            s1 += sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            s2 += sc.nextInt();
        }
        System.out.println(s1.indexOf(s2));
    }
}
