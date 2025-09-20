import java.util.Scanner; // import the Scanner class to let user input 


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
			myScanner.nextLine(); 
			
			
			if(type == 1) {
				System.out.println("What is the binary number?");
				String binary = myScanner.nextLine();
				System.out.println("The decimal value is " + binaryToDecimal(binary));
			}
		
			else if (type == 2) {
				System.out.println("What is the Decimal number?");
				String decimal = myScanner.nextLine();
				System.out.println("The binary value is " + decimalToBinary(Integer.parseInt(decimal)));
			}
			
			System.out.print("Do you want to continue - yes or no?");
			String again = myScanner.nextLine();
			if(again.equals("no")) {
				runAgain = false;
			}
		}
	
		myScanner.close();
	}

	public static String decimalToBinary (int bin) {
		if (bin == 0) {
			return "0"; 
		}

		String result = "";
		while (bin > 0) {
			int remainder = bin % 2; 
			result = remainder + result; 
			bin = bin / 2; 
		}
		return result;

	}

	public static int binaryToDecimal (String dec) {
		int decimalValue = 0;
		int power = 0;
		for (int i = dec.length() - 1; i >= 0; i--) {
			char c = dec.charAt(i);
			if (c == '1') {
				decimalValue += Math.pow(2, power);
			}
			power++;
		}
		return decimalValue;
	} // end main
} // end class
