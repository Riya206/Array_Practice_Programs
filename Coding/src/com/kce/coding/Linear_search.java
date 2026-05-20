package com.kce.coding;

import java.util.Scanner;

public class Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of array:");
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 System.out.println("Enter the elements:");
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 System.out.println("Enter the element to be searched");
		 int key=sc.nextInt();
		 
	
	for(int i=0;i<n;i++) {
		if(arr[i]==key) {
			System.out.println("Element found at index:"+(i+1));
			return;
		}
			
		}
	System.out.println("Element is not found ");
	}
	
}
