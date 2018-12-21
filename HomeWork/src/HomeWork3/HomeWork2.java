package HomeWork3;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int max = Integer.MIN_VALUE;
        int k = 0;
        for (int i = 0; i < n ; i++) {
            array[i] = sc.nextInt();
            if (Math.abs(array[i]) > max) {
                max = Math.abs(array[i]);
                k = i;
            }
        }
        System.out.println(k);
    }
}
