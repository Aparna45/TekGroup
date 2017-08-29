package com.tek;

public class BubbleLogic{ 
	public void Bubble(int a[]) 
	{ 
	int i,j,m,n=a.length;
	for(i=0;i<n-1;i++) {
		for(j=0;j<n-i-1;j++) {
			if(a[j]>a[j+1])
			{
				 m=a[j];
				a[j]=a[j+1];
				a[j+1]=m;				
}
}
	}
	printarray(a);
}
	void printarray(int a[])
	{
		int n=a.length;
		System.out.println("sorted elements");
		for(int i=0;i<n;++i)
			System.out.println(a[i]+" ");
		System.out.println();
}
}