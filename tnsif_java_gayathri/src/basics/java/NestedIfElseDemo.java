package basics.java;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		int a=1000;
		int b=20000;
		int c=100;
		System.out.println("The largest number is");
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
		else {
			if(b>c) {
				System.out.println(b);
			}
			else {
				System.out.println(c);
			}
		}
		

	}

}
