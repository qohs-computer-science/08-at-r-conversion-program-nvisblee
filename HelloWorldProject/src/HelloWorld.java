import java.util.Scanner;


/*
 * TODO: Arun Mariappan
 * TODO: 9/18/25
 * TODO: 4
 * TODO: converts decimal to binary and binary to deimal. 
 */
public class HelloWorld {

	public static void main(String[] args) {
		//TODO: Implement Program Requirements Here
		Scanner myScanner = new Scanner(System.in);

		boolean runAgain = true; 
		while(runAgain) { 
			System.out.println("Welcome!  You have the following options:");
			System.out.println("1. Binary to Decimal");
			System.out.println("2. Decimal to Binary");
			System.out.print("Which type of conversion would you like to perform? (type 1 or 2)");
			int type = myScanner.nextInt();
			if(type == 1) {
				System.out.println("What is the binary number?");
				String binary = myScanner.nextLine();
				



		}
		
		else if (type == 2) {
			System.out.println("What is the Decimal number?");
			String decimal = myScanner.nextLine();
			int ans = binaryToDecimal(decimal);



			

		}
	}


	public static String decimalToBinary (int bin) {
		String binaryAsNum = Integer.toBinaryString(bin);		
		return binaryAsNum;

	}
	public static int binaryToDecimal (String dec) {
		int decimalAsNum = Integer.parseInt(dec); 
		return decimalAsNum; 
		


	}
		
		
	myScanner.close(); 
	}

}
