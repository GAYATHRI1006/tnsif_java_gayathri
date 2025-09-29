package programming.basics.java;

public class Addition {
	// input and output memory is stored in String memory so it is present in main function 
	// static keyword is used to call automatically(automatic execution of main method in java because jvm call the class file
	
	public static void main(String[] args) {
	// args input in converted to int type
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int c = a+b;
		// output also is in string so we use + symbol in print statement for concate two string
		System.out.println("Addition of a = "+a+" and b = "+b+" is : "+c);
		

	}

}
