package com.gayathri.assignmenttwo;
import java.util.*;
public class InformationClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		String name = sc.nextLine();
		System.out.print("Enter your Register number: ");
		long reg = sc.nextInt();
		System.out.print("Enter your Grade: ");
		String grade = sc.nextLine();
		System.out.print("Enter your Percentage: ");
		String percentage = sc.nextLine();
		System.out.println("Enter your Name: "+name);
		System.out.println("Enter your Register number: "+reg);
		System.out.println("Enter your Grade: "+grade);
		System.out.println("Enter your Percentage: "+percentage);
	}

}
