package com.company;
import java.util.Scanner;
public class HomeWork00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] arr = a.toCharArray();
        a = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                arr[i] = '*';
            }
            a += arr[i];
        }
        System.out.println(a);
    }
}
