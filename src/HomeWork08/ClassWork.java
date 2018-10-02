package HomeWork08;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isMagic = true;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int diagSum = 0;
        for (int i = 0; i < n; i++) {
            diagSum += matrix[i][i];
        }
        int collAlterDiagSum = 0;
        for (int i = 0; i < n; i++) {
            collAlterDiagSum += matrix[i][n - i - 1];
        }
        if (diagSum != collAlterDiagSum) {
            isMagic = false;
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                rowSum += matrix[i][j];
            }
            if (diagSum != rowSum) {
                isMagic = false;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int rowSum2 = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                rowSum2 += matrix[j][i];
            }
            if (diagSum != rowSum2) {
                isMagic = false;
            }
        }
        if (isMagic == true) {
            System.out.println("Magic");
        } else {
            System.out.println("NotMagic");
        }
    }
}

