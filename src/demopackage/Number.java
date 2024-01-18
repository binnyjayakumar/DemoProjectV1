package demopackage;

import java.util.Scanner;

public class Number {

		public static String decimalToBinary(int number) //Decimal to binary conversion
		{
			int remainder, quotient = number;
			String binarynum = "";
			while(quotient > 0)
			{
				remainder = quotient % 2;
				binarynum = remainder + binarynum;
				quotient = quotient / 2;
			}
			return binarynum;
		}

		public static String decimalToOctal(int number) //Decimal to octal conversion
		{
			String octalnum = "";
			int remainder, quotient = number;
			while (quotient > 0) 
			{
				remainder = quotient % 8;
				octalnum = remainder + octalnum;
				quotient = quotient / 8;
			}
			return octalnum;
		}

		public static String decimalToHexa(int number) //Decimal to hexadecimal conversion
		{
			String hexanum = "";
			char hexachars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; 
			int remainder, quotient = number;
			while (quotient != 0) 
			{ 
				remainder = quotient % 16; 
				hexanum = hexachars[remainder] + hexanum;
				quotient = quotient / 16;  
			}  
			return hexanum;
		}

		public static void main(String[] args) //Main method
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the decimal number to convert: ");
			int number = s.nextInt();
			s.close();
			String binary = decimalToBinary(number);
			System.out.println("The binary number of "+number+" is: "+binary);
			String octal = decimalToOctal(number);
			System.out.println("The octal number of "+number+" is: "+octal);
			String hexa = decimalToHexa(number);
			System.out.println("The hexadecimal number of "+number+" is: "+hexa);
		}
	}




