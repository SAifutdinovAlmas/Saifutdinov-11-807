package HomeWork3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int k = 0;
        for (int i = 1; i < n-1 ; i++) {
            if (array[i]>array[i-1] && array[i]>array[i+1]) {
                k++;
            }
        }
        System.out.println(k);
    }
}
