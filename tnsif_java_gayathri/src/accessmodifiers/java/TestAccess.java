package accessmodifiers.java;


public class TestAccess {

	public static void main(String[] args) {
			
		AccessModifiersDemo ame = new AccessModifiersDemo();
			
		System.out.println("Public Variable: "+ ame.publicVar);
		//System.out.println("Private Variable: "+ ame.privateVar);
		System.out.println("Protected Variable: "+ ame.protectedVar);
		System.out.println("Default Variable: "+ ame.defaultVar);

	}

}


