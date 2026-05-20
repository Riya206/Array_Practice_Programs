package com.kce.coding;

import java.util.Scanner;

public class Array_Sorted_or_Not {

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
	 boolean sorted=true;
	 for(int i=0;i<n;i++) {
	 if(arr[i]>arr[i+1]) {
		 sorted=false;
		 break;
	 }
		 if(sorted) {
				 System.out.println("Array is sorted");
		 }
			 else
				 System.out.println("Array is Not sorted");
	 }
 }
}

