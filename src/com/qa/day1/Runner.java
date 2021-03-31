package com.qa.day1;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello");
	}
	
	public static void main() {
		
		int r1 = Calculator.add(10, 20);
		System.out.println(r1);
		
		int r2 = Calculator.subtract(100, 20);
		System.out.println(r2);
		
		double r3 = Calculator.multiply(10, 5);
		System.out.println(r3);
		
		double r4 = Calculator.divide(1000, 20);
		System.out.println(r4);
		
		
	}
	
	
}
