package com.kce.coding;

import java.util.Scanner;

public class odd_even_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int odd=0;
        int even=0;

        System.out.println("Enter elements:");

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            
            if(arr[i]%2==0) {
            	even++;
            }
            	else {
            		odd++;
            }
        }
        System.out.println("Odd count" + odd);
        System.out.println("Even count" +even);
	}

}
