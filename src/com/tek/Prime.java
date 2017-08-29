package com.tek;

public class Prime {

	public static void main(String[] args) {
		int i,j,a=0;
		int n=26;
		j=n/2;
		for(i=2;i<=j;i++) {
			if(n%i==0) {
				System.out.println("not prime");
				a=1;
				break;
			}
		}
		if(a==0)// TODO Auto-generated method stub
System.out.println("Prime number");
	}

}
