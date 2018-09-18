package com.company;

public class Aa2 {
    public static void main(String[] args) {
        int[] arr = {1, 20, 10, 5, 100, 15};
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j += 1) {
                for (int k = 0; k < 3; k += 2) {
                    if (arr[i] < arr[j] && arr[j] > arr[k]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}