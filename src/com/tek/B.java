package com.tek;

public class B {
private int i,j,z;
	public B(int i, int j) {
	this.i = i;
	this.j = j;
}
	
	public int getI() {
	return i;
}
public void setI(int i) {
	this.i = i;
	System.out.println(i);
}
public int getJ() {
	return j;
}
public void setJ(int j) {
	this.j = j;
	System.out.println(j);
}


public int add ()
	{
		z = i + j;
		System.out.println(z);
		return z;
	}
	
	
	
}
