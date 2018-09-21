package com.company;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] arr = a.toCharArray();
        System.out.println("Выберите регистр u/l");
        String check = sc.next();
        switch (check) {
            case "u":
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= 'a' && arr[i] <= 'z') {
                        arr[i] = (char) (arr[i] - 32);
                    }
                }
                break;
            case "l":
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= 'A' && arr[i] <= 'Z') {
                        arr[i] = (char) (arr[i] + 32);
                    }
                }
                break;
        }
        a = "";
        for (int i = 0; i < arr.length; i++) {
            a += arr[i];
        }
        System.out.println(a);
    }
}
