package HomeWork3;

import java.util.Scanner;


public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int s = 0;
        for (int i = 0; i < n ; i++) {
            array[i] = sc.nextInt();
            s += array[i];
        }
        double av = s / n;
        s = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > av) s++;
        }
        System.out.println(av +", " + s);
    }
}
