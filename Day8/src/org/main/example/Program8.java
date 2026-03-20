package org.main.example;

import java.util.Arrays;

public class Program8 {	
	public static void main(String[] args) {
		int[] arr = new int[] {10,20,30};
		int element = arr[1];
		System.out.println(element);
		
		//int element1 = arr[-1];
		//System.out.println(element);	//java.lang.ArrayIndexOutOfBoundsException
		
		int element2 = arr[arr.length];
		System.out.println(element2);	//java.lang.ArrayIndexOutOfBoundsException
	}
}