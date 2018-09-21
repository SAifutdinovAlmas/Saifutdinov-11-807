package com.company;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s*10 + arr[i]-48;
        }
        System.out.println(s);
    }
}