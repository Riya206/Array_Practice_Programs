package com.kce.coding;
import java.util.*;
public class Find_Missing_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int N=n+1;
		int total=N*(N+1)/2;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		int missing=total-sum;
		System.out.println(missing);
		

	}

}
