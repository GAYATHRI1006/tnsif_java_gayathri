/*
 All are considered or converted to object in java so it is an oops language
 Primitive data type are not objects so except primitive data type all are object
 Objects are created inside main method
 () ->method
 new -> keyword
 */
package basics.java; //The package name should be same as the package which contain this basicJava class error will through if the another package name is given like package javating
public class BasicJava {
//declaration of variable
	String name;
	int age;
	public static void main(String[] args) {
		BasicJava obj = new BasicJava(); //class_name obj = new reference_class_name();reference_class_name is a name of another class if we need to connect the two class
		obj.name="Gayathri";
		System.out.println("Name is " + obj.name);
	}	
}
