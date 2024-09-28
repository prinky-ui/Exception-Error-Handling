package excepationanderrorhandaling;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		
		System.out.println("Program Stated");
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the number :" );
		
	
		int num = Sc.nextInt();
		try {
			System.out.println(100/num);	
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handle Exception ....");
			System.out.println(e.getMessage());
			System.out.println("Invalid Value");
			
		}
		System.out.println("Program Ended");

	}

}
