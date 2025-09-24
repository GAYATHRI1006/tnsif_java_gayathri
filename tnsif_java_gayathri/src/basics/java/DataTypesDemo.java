package basics.java;

public class DataTypesDemo {

	//f literal must be used for float in java
	
	public static void main(String[] args) {
		
		int val1 = 9/2;// integer division
		float val2= 101/61;// integer division happens first, result stored as float
		double val3=10d/6d; // double division
		float val4=5/2.5f; // int 5 promoted to float → float division
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		
		int mark=512;
		// assigning expression to variable 
		double percentage=mark*0.46f; // int promoted to float → result stored as double
		System.out.println(percentage);
		

	}

}
