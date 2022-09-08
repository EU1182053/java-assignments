
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment128 {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        Scanner sc = new Scanner(System.in);
        
        try {
            
            System.out.println("Enter the size of an array: ");
            int arrSize = Integer.parseInt(br.readLine());
            int[] myArray = new int[arrSize];
            System.out.println("Size of the array: "+myArray.length);


            // String[] myArray1 = {"Maharshtra", "Gujarat", "Rajasthan"};
            // myArray1[3] = "Telangana";

            System.out.println("Enter a number.");
            int myInt = sc.nextInt();
            System.out.println("Sqaure of given number is "+myInt * myInt);;
        }
         catch (NegativeArraySizeException ex) {
            System.out.println("Can't create array of negative size");
        }
        catch(ArrayIndexOutOfBoundsException ar){
            System.out.println("array limit exceeded.");
        }
        catch(InputMismatchException im){
            System.out.println("Enter a valid number.");
        }
        
    }
}
