package samples;

public class Recursion {
	 
	    static int factorial(int n){      
	          if (n == 1)      
	            return 1;      
	          else      
	            return(n*factorial(n-1));      
	    }      
	  
	public static void main(String[] args) {  
	System.out.println("Factorial of 8 is:" +factorial(8));  
	}  
}
