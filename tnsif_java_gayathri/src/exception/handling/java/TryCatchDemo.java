package exception.handling.java;

public class TryCatchDemo {

	public static void main(String[] args) {
		System.out.println("I am in main method");
		int result;
		try {

			result = TryCatchExample.performDivision(12, 0);
			if (result != 0)
				System.out.println("Division is " + result);

			System.out.println("------------------------------");

			result = TryCatchExample.performDivision(12, 3);
			if (result != 0)
				System.out.println("Division is " + result);

			System.out.println("------------------------------");
		} catch (ArithmeticException e) { //variable e is used to print the exception error arises in it
			//System.out.println("I am in catch block: " + e.getMessage());
			e.printStackTrace(); 
		}
		System.out.println(TryCatchExample.performDivision(12f, 5f));

		System.out.println("------------------------------");
		System.out.println(TryCatchExample.performDivision(12f, 0f));// it shows output as infinity, because if we divide double or float by zero(it has so long output so jvm guves 'eee350' code then compiler gives as infinity)

	}

}
