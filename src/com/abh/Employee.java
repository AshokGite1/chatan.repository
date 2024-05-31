package com.abh;

import java.util.Iterator;

public class Employee {
	
	
	//given a sentence remove the palindrome word from it: 
		//Input : "Madam is so strict in evaluating paper".
		//Output: "is so strict in evaluating paper"
	
	public static void main(String[] args) {
		
		String s="Madamm is so strict in evaluating paper";
		   char[] arr = s.toCharArray();
		String s1="";
		
		for(int i=arr.length-1;i>=0;i--) {
			
			s1 = s1+arr[i];
		}
		if(s1.equals(s1)) {
			System.out.println("it is palindrome iiiiiiiii");
			
		}
		else {
			System.out.println("not palindrome");
		}
		
	}

}
