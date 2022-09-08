package assignment248;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Assignment248 {

	public static void main(String[] args) {
		String data = "This is the demo of print writer.";
		try {
			
			PrintWriter output = new PrintWriter("output.txt");
			
			output.print(data); // on the same line the writer will write the data
			System.out.println(data);
			output.println(true);
			output.print("Using println function."); // println setting true becoz we want text on new line
			output.println(true);
			char[] charArray = {
					'N', 'e', 'o', 's', 'o', 'f', 't'
			};
			output.print(charArray);
			
			output.append("\tTechnologies"); // append our string
			
			System.out.println(output.checkError()); // will show error if any like stream not close or any other
			
			
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
