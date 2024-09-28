package excepationanderrorhandaling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExcepation {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Program Started.....");
		
		FileInputStream file= new FileInputStream("C:\\Prinky.txt");
		
		System.out.println("Program Completed........");
		

	}

}
