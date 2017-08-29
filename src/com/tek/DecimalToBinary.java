package com.tek;

public class DecimalToBinary {
	public void printBinaryFormat(int num) {
		int binary[]= new int[10];
		int index=0;
		int i;
		while(num>0) {
			binary[index++]=num%2;
			num=num/2;
		}
		for(i=index-1;i>=0;i--);{
			System.out.println(binary[i]);	
		}
	}
		
public static void main(String args[]) {
	DecimalToBinary dtb= new DecimalToBinary();
	dtb.printBinaryFormat(10);
}
}