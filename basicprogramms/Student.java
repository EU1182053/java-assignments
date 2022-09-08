package basicprogramms;


import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int marks = (m1 + m2 + m3) / 3;
        if (marks >= 70) {
            System.out.println("Distinction");
        } else if (60 <= marks && marks <= 69) {
            System.out.println("First Class");
        } else if (50 <= marks && marks <= 59) {
            System.out.println("Second Class");
        } else if (35 <= marks && marks <= 49) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
