package basicprogramms;


import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	int m1 = sc.nextInt();
	int m2 = sc.nextInt();
	int m3 = sc.nextInt();
	int marks = (m1+m2+m3)/3;
	String grade;
    if(marks >= 70){
	 grade = "Distinction";
}
	else if(60 <= marks && marks <= 69){
		grade = "First Class";
}
	else if(50 <= marks && marks <= 59){
		grade = "Second Class";
}
	else if(35 <= marks && marks <= 49){
		grade = "Pass";
}
	else{
		grade = "Fail";
	}
	switch(grade){
		case "Distinction":
			 System.out.println("Distinction");
		case "First Class":
        System.out.println("First Class");
		case "Second Class":
        System.out.println("Second Class");
		case "Pass":
        System.out.println("Distinction");
		case "Fail":
        System.out.println("Fail");
		

	}
    }
}
