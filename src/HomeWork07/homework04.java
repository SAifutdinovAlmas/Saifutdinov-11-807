package HomeWork07;


public class homework04 {
    public static void main(String[] args) {
        System.out.print(function(123));
    }

    static String function(int x) {
        if (x / 1 == 0) {
            return String.valueOf(0);
        } else {
            return function(x/10) + " " + x%10;
        }
    }
}
