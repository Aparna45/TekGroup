package com.tek;

public class IfElseIfSample {

	private int result;
	
	
		
	public IfElseIfSample(int result) {
		super();
		this.result = result;
	}


	public void print() {
		System.out.println(result);
	}
		
	
	public static void main(String[] args) {

	
	B b = new B(3,5);		
		 int result = b.add();
		IfElseIfSample sample = new IfElseIfSample(result);
		sample.print();
		  
		
	}
		

}
