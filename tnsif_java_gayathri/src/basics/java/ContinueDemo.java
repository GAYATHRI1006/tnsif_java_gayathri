package basics.java;

public class ContinueDemo {

	public static void main(String[] args) {
		for(int i=3;i<=15;i++) {
			
			// Odd numbers are skipped
			if(i%2!=0) {
				continue;
			}
			
			// Even numbers are printed
			System.out.print(i+" ");
		}

	}

}
