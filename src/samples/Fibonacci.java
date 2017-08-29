package samples;

public class Fibonacci 
{
	public void Fibo1()
	{	
	      int count = 50;
	      int[] a = new int[count];
	      a[0] = 0;
	      a[1] = 1;
	    
	      for(int i = 2; i < count; i++) {
	         a[i] = a[i-1] + a[i-2];
	      }
	      for(int i = 0; i< count; i++) {
	         System.out.print(a[i] + " ");
	      }
	      }
	}


