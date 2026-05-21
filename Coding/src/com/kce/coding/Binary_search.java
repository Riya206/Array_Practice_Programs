package com.kce.coding;

import java.util.Scanner;

public class Binary_search {

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
		 System.out.print("Enter value to be searched");
		 int key=sc.nextInt();
	
	int low=0; 
	int high=n-1;
	while(low<=high){
		int mid=(low+high)/2;
		if(arr[mid]==key) {
			System.out.print(mid);
			return;
		}
		else if(arr[mid]>key) {
			high=mid-1;
		}
		else {
			low=mid+1;
		}
	}
	System.out.print("Element not found ");
	}
}
