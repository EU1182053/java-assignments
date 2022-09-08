package basicprogramms;

public class Amstrong {
    public static void main(String[] args) {
        int num = 371;
        int temp = num;
        int digit, sum = 0;

        while (temp != 0) {
            digit = temp % 10;
            // System.out.print(digit);
            sum = sum + digit * digit *digit;
            System.out.println(sum);
            temp = temp / 10;
            // System.out.print(sum);
        }

        if (sum == num) {
            System.out.print("The number is Armstrong");
        } else {
            System.out.print("The number is not Armstrong");
        }
    }
}
