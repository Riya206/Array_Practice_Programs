package com.kce.coding;

import java.util.Scanner;

public class Missing_number {

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
		 int sum=0;
		 for(int i=0;i<n;i++) {
			 sum+=arr[i];
			 
		 }
		 int total=((n+1)*(n+2))/2;
		 int missing=total-sum;
		 System.out.println("Missing element" +missing);
	}
 
}
