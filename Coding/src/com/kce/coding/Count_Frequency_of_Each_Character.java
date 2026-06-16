package com.kce.coding;
import java.util.*;
public class Count_Frequency_of_Each_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Map<Character,Integer>map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		for(char key : map.keySet()) {
			System.out.println(key+ "->" + map.get(key));
		}

	}

}
