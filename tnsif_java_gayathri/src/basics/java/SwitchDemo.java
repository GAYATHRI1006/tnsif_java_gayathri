package basics.java;

public class SwitchDemo {

	public static void main(String[] args) {
		char x='s';
		switch(x) {
		case 'l':
		case'L':
			System.out.println(x+" is a Letter");
			break;
		case 'd':
		case 'D':
			System.out.println(x+" is a Digit");
			break;
		case 'w':
		case'W':
			System.out.println(x+" is a White Symbol");
			break;
		case 's':
		case'S':
			System.out.println(x+" is a Special Symbol");
			break;
		default:
			System.out.println("x is other");
			break;
		}

	}

}
