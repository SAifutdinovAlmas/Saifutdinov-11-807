package HomeWork6;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(check(array));
    }
    public static boolean check(int[] arr) {
        boolean flag = false;
        outerLoop: for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {flag = true; break outerLoop;}
            }
        }
        return flag;
    }
}
