package com.tek;

public class BubbleSort {
	static void bubblesort(int[]arr) {
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
	int arr[]= {4,32,65,48,67};
			int i;
	System.out.println("before bubble sort");
			for(i=0;i<arr.length;i++) {
				System.out.println(arr[i]+"");
				bubblesort(arr);
				System.out.println(" after bubble sort");
				for(i=0;i<arr.length;i++) {
					System.out.println(arr[i]+"");
			}
		}
		// TODO Auto-generated method stub

	}

}
