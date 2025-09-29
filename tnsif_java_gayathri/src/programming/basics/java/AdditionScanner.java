package programming.basics.java;

import java.util.*;

public class AdditionScanner {
	// scanner class is used to give inputs in console 
	public static void main(String[] args) {
		
		// create object for scanner class
		Scanner s= new Scanner(System.in);
		// s is a reference of scanner class
		System.out.println("Enter the numbers: ");
		int a = s.nextInt(); // nextInt() is a method
		int b = s.nextInt(); 
		int c = a+b;
		System.out.println("Addition of a = "+a+" and b = "+b+ " is "+c);
		s.close();
	}

}
