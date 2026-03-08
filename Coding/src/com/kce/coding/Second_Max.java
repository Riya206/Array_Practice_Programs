package com.kce.coding;

import java.util.Scanner;

public class Second_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the size of array:");
 int n=sc.nextInt();
 int arr[]=new int[n];
 
 System.out.println("Enter the Elements of array:");
 for(int i=0;i<n;i++) {
	 arr[i]=sc.nextInt();
 }
 int max=Integer.MIN_VALUE;
 int secondMax=Integer.MIN_VALUE;
 for(int i=0;i<n;i++) {
	 if(arr[i]>max) {
		 secondMax=max;
		 max=arr[i];
		 
	 }
	 if(arr[i]>secondMax && arr[i]!=max) {
		 secondMax=arr[i];
	 }
 }
 System.out.println("Second Largest: " + secondMax);
	}
}
 