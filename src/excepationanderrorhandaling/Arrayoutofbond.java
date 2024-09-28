package excepationanderrorhandaling;

import java.lang.reflect.Array;

public class Arrayoutofbond {

	public static void main(String[] args) {
		int[] value = {23,24,56,78,90};
		try {
		System.out.println(value[0]);
		System.out.println(value[1]);
		System.out.println(value[2]);
		System.out.println(value[3]);
		System.out.println(value[4]);
		System.out.println(value[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		String [] name= {"Sam","Peter","Jack","Nick"};
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		System.out.println(name[4]);
		
		System.out.println("Handle Array out of bond....");

		}	

	}

}
