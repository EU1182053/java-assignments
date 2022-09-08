package basicprogramms;

public class Fibonacci {
    public static void main(String[] args) {

        int t1 = 1, t2 = 1, t3 = 0, ui = 5;
        System.out.println(t1);
        System.out.println(t2);
        for (int i = 0; i < ui; i++) {
            t3 = t1 + t2; // t3 = 2,3
            System.out.println(t3);
            t1 = t2; // t1 = 1,2
            t2 = t3; // t2 = 2,3
        }
    }
}
