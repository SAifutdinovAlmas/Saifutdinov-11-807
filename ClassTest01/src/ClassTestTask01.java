import java.util.Arrays;
import java.util.Scanner;

public class ClassTestTask01 {//Вариант 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] array = getSideDiagonalAsVector(matrix);
        System.out.println(Arrays.toString(array));
        int[] vector = mult(matrix, array);
        System.out.println(Arrays.toString(vector));
        sortArr(vector);
        System.out.println(Arrays.toString(vector));
    }

    static int[] getSideDiagonalAsVector(int[][] matrix) {
        int[] arr = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            arr[i] = matrix[i][matrix.length - i - 1];
        }
        return arr;
    }

    static int[] mult(int[][] matrix, int[] arr) {
        int[] vector = new int[matrix.length];
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                vector[i] += (matrix[i][j] * arr[j]);
            }
        }
        return vector;
    }

    static void sortArr(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Math.abs(array[j]) < Math.abs(array[j + 1])) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
