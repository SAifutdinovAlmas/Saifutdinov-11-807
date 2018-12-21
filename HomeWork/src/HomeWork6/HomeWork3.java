package HomeWork6;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int k = 1;
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            if (array[i + 1] == array[i]) {
                k++;
                if (k > max) max = k;
            } else {
                k = 1;
            }
        }
        System.out.println(max);
    }
}
