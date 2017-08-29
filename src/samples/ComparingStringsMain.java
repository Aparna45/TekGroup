package samples;

import java.util.Scanner;

public class ComparingStringsMain {
	

	public static void main(String[] args) {
		String sc11;
		String sc22;
	      Scanner sc11 = new Scanner(System.in); 
		  System.out.print("enter first string: ");
	      String  fS= sc11.nextLine();
	      System.out.print("enter second string: ");
	      Scanner sc21 = new Scanner(System.in); 
	      String j = sc21.nextLine();
	     
	      
	      int firstStringLength = fS.length();
	      int secondStringLength = j.length();
	      if (firstStringLength > secondStringLength) {
	         System.out.println("The first string is longther than the second string");
	      } 
	      else if (secondStringLength > firstStringLength) {
	         System.out.println("The second string is longther than the first string");
	      } 
	      else {
	         System.out.println("The first and second string have equal lengths");
	}

}
}
