package basicprogramms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int rev=0;
        int rem=0,temp;
        temp=num;

        while(num!=0){
            rem = num%10;
            // System.out.println(rem);
            rev=rev*10+rem;
            // System.out.println(rev);
            num=num/10;
        }

        if(rev==temp){
            System.out.println("Palindrome:Same after reverse");
        }
        else{
            System.out.println("Not a Palindrome:Different after reverse.");
        }
    }
}
