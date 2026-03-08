package com.kce.coding;

import java.util.Scanner;

public class Array_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of an Array:");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("Enter the elements:");
     for(int i=0;i<n;i++) {
    	 arr[i]=sc.nextInt();
     }
     System.out.println("Array elements are:");
     for(int i = 0; i < n; i++){
         System.out.println(arr[i] + " ");
     }
     
 	
	}
	
	

}
