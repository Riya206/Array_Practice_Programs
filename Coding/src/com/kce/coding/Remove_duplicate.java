package com.kce.coding;

import java.util.Scanner;

public class Remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n= sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int j=0;
		for(int i=1;i<n;i++) {
			if(arr[i]!=arr[j]) {
				j++;
				arr[j] = arr[i];
			}
		}
		for(int i=0;i<=j;i++) {
		System.out.print( "duplicates removed " + arr[i]);
	}
	}

}
