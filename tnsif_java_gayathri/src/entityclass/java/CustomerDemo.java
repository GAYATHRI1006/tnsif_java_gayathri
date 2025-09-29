package entityclass.java;

public class CustomerDemo {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.setId(101);
		c1.setCname("Gandhimathi");
		c1.setCity("Viruthachalam");
		System.out.println(c1);//object is printed because we use toString method 
		Customer c2 = new Customer();
		c2.setId(102);
		c2.setCname("Gayathri");
		c2.setCity("villupuram");
		System.out.println(c2);
	
	}

}
