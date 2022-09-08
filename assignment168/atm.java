package assignment168;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class atm {

    public static boolean login() throws IOException, InvalidAccountCredential{
        String inputS;
        int inputN;
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        account1 account = new account1();
        
        // System.out.print(account.getaName());
        System.out.print("Enter Account Holder Name: ");
        inputS=br.readLine();
        System.out.print("Enter Account Number: ");
        inputN=sc.nextInt();
        return account.verifyAccount(inputS, inputN);
    }
    
    public static boolean pin() throws InvalidPinException {
        int InputN;
        Scanner sc = new Scanner(System.in);
        account1 account  = new account1();
        System.out.print("Enter Your Pin: ");
        InputN = sc.nextInt();
        return (account.verifyPin(InputN));
        
    }
    
    public static boolean options()throws InvalidWithdrawalAmount, PinDontMatch, FourDigitPin, NoMoreNote, AmountUnavailable{
        int choice = 0;
        Scanner sc = new Scanner(System.in); 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        account1 account  = new account1();
        do {
            System.out.println("Enter ");
            System.out.println("1 for Account Detail");
            System.out.println("2 for check balance");
            System.out.println("3 for withdraw");
            System.out.println("4 for generate pin");
            System.out.println("5 for exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Acount Holder Name: " + account.getaName());
                    System.out.println("Account Number " + account.getaNumber());
                    System.out.print("Your current balance is ");
                    System.out.format("%.2f",account.getaAmount());
                    System.out.println();
                    System.out.println();
                    return true;
                case 2:
                    System.out.print("You current balance is ");
                    System.out.format("%.2f",account.getaAmount());
                    System.out.println();
                    return true;
                case 3:
                    return account.withdraw();
                case 4:
                    return account.setnewPin();
                case 5:
                    System.out.println("Logout Successfull");
                    return false;
                default:
                    return true;
            }
        } while (choice!=5);
    }
    
	public static void main(String[] args) throws InvalidPinException {
        boolean clock =true;
        do {
            boolean clock1 = true; //Pin Verification
            boolean clock2 = true; // Login
            boolean clock3 = true; // Options
            while (clock2) {
                try {
                    clock2 = atm.login();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            while (clock1) {
                try {
                    clock1 = pin();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            while (clock3) {
                try {
                    clock3 = options();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } while (clock);
    }
}
