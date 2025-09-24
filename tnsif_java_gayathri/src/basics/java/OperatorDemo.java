package basics.java;

public class OperatorDemo {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int x=10;
		System.out.println("a and b value before: "+ a+" "+b);
		
		++a;
		int c=++a+b+a--;
		System.out.println("c value: "+c);
		
		int d=c+++a+b--;
		System.out.println("d value: "+d);
		System.out.println("After operation a,b,c,d is: "+a+" "+b+" "+c+" "+d);
		
		x=(10==x)?1:0;
		System.out.println(x);
		
		
	}

}
