package com.kce.coding;


import java.util.*;


public class Remove_Duplicates_from_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int[]arr=new int[n];
          for(int i=0;i<n;i++) {
        	  arr[i]=sc.nextInt();
          }
          Set<Integer>s=new HashSet<>();
          for(int i=0;i<n;i++) {
        	  s.add(arr[i]);
          }
       for(int num:s) {
    	   System.out.print(num);
       }
	}


}	