package HomeWork5;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] array = s.toCharArray();
        System.out.println("Выберите регистр u/l");
        String check = sc.next();
        switch (check) {
            case "u":
                for (int i = 0; i < array.length; i++) {
                    if (array[i] >= 'a' && array[i] <= 'z') {
                        array[i] = (char) (array[i] - 32);
                    }
                }
                break;
            case "l":
                for (int i = 0; i < array.length; i++) {
                    if (array[i] >= 'A' && array[i] <= 'Z') {
                        array[i] = (char) (array[i] + 32);
                    }
                }
                break;
        }
        s = "";
        for (int i = 0; i < array.length; i++) {
            s += array[i];
        }
        System.out.println(s);
    }
}
