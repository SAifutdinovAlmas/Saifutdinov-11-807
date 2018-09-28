package HomeWork07;

import java.util.Scanner;

public class homework02 {
    public static int recurs(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + recurs(n/10)  ;
        }
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = recurs(336);
        System.out.println(n);
    }
}
