

public class Assignment98 {

    static int add(int num1,int num2){
        if (num2 != 1) {
            return add(num1, num2-1) + 1;
        } else {
            return num1+1;
        }
    }

    static double add(int num1, double num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        System.out.println(add(13,3));
        // the funtion is performing over riding as it is using recurrsion

        System.out.format("%2f",add(10, 22.2));
        System.out.println();
        System.out.format("%2f",add(10, (float)22.2));
        // this is upcasting, accepting float in double.
    }
}