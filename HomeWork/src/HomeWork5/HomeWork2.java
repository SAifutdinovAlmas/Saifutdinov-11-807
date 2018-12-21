package HomeWork5;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] array = s.toCharArray();
        s = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= '0' && array[i] <= '9') {
                array[i] = '*';
            }
            s += array[i];
        }
        System.out.println(s);
    }
}
