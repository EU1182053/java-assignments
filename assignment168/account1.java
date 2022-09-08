package assignment168;

import java.util.Scanner;

public class account1 {
	Scanner sc = new Scanner(System.in);
    public String aName="admin";
	public int aNumber=12;
    public static float aAmount=(float) 3778.32;
    public static int aPin = 7890;
	static int count100, count2000, count500;
	public static int note100 = 2;
	public static int note500 = 2;
	public static int note2000 = 1;
	public static int total = 2000*note2000 + 500 * note500 + 100 * note100;
    

    public boolean verifyAccount(String aName, int aNumber) throws InvalidAccountCredential{
        if (aName.equalsIgnoreCase(aName)){
            if(this.aNumber == aNumber){
                return false;
            }
            else{
                throw new InvalidAccountCredential("Invalid Credential");
            }
        }
        return false;  
    }

    public boolean verifyPin(int aPin) throws InvalidPinException{
        if (this.aPin==aPin) {
            return false;
        }
        throw new InvalidPinException("Invalid Pin");
    }

	public boolean withdraw()throws InvalidWithdrawalAmount, NoMoreNote, AmountUnavailable{
		System.out.print("Your current balance is ");
		System.out.format("%.2f",getaAmount());
		System.out.println();
		System.out.println("Enter the Amount of withdrawal: ");
		int withdrawal = sc.nextInt();
		return calculate(withdrawal);
	}

	public boolean setnewPin()throws PinDontMatch,FourDigitPin{
		System.out.println("Enter the new pin");
		int npin=sc.nextInt();
		if ((int) (npin / 1000) > 0 && (int) (npin/10000) == 0) {
			System.out.println("Confirm Your Pin:");
			int cpin=sc.nextInt();
			if (npin == cpin){
				setaPin(npin);
				return false;
			}else{
				throw new PinDontMatch("The Pin Don't Match");
			}
		} else {
			throw new FourDigitPin("The new Pin should be four digit");
		}
	}

	public static void deplition(int count2000, int count500, int count100){
		note100 = note100 - count100;
		note500 = note500 - count500;
		note2000 = note2000 - count2000;
		total = total - (2000*count2000 + 500 * count500 + 100 * count100); 
	}

	public static boolean calculate(int withdrawal) throws InvalidWithdrawalAmount, NoMoreNote, AmountUnavailable{
        int tempwithdrawal = withdrawal;
        int goneAmount=0;
        boolean clock = true;
        if (withdrawal>aAmount) {
			throw new AmountUnavailable("Enter Amount is more than Amount in your account");
		} else {
			if (tempwithdrawal % 100 == 0) {
				while (clock) {
					if (note2000 > 0 && tempwithdrawal >= 2000) {
						System.out.println("Deplition 2000");
						tempwithdrawal = tempwithdrawal - 2000;	
						goneAmount = goneAmount + 2000;
						count2000 = count2000 +1;
						deplition(1, 0, 0);
					} else if (note500 > 0 && tempwithdrawal >= 500){
						System.out.println("Depleition 500");
						tempwithdrawal = tempwithdrawal -500;
						goneAmount = goneAmount + 500;
						count500 = count500 +1;
						deplition(0, 1, 0);
					} else if (note100 > 0 && tempwithdrawal >= 100){
						System.out.println("Deplition 100");
						tempwithdrawal = tempwithdrawal -100;
						goneAmount = goneAmount + 100;
						count100 = count100 +1;
						deplition(0, 0, 1);
						// deplition(0, 0, 1);
					} else{
						clock =false;
					}
				}
				if (withdrawal == goneAmount) {
					// deplition(count2000, count500, count100);
					// count100 = 0 ;
					// count2000 = 0 ;
					// count500 = 0 ;
					aAmount = aAmount - (float)goneAmount;
					return false;
				} else{
					deplition(-count2000, -count500, -count100);
					throw new NoMoreNote("No More Note Available in assignment168");
				}
			} else {
				throw new InvalidWithdrawalAmount("Invalid WIthdrawal Amount");
			}
		}
    }

	@Override
	public String toString() {
		return "account [aName=" + aName + ", aNumber=" + aNumber + ", aAmount=" + aAmount + ", aPin=" + aPin + "]";
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public int getaNumber() {
		return aNumber;
	}
	public void setaNumber(int aNumber) {
		this.aNumber = aNumber;
	}
	public int getaPin() {
		return aPin;
	}
	public void setaPin(int aPin) {
		this.aPin = aPin;
	}
    public float getaAmount() {
		// int number = 0;
		// number = (int) (aAmount * 100);
		// aAmount = (float) number / 100;
		return (float) aAmount;
	}
	public void setaAmount(float aAmount) {
		this.aAmount = aAmount;
    }
    
}
