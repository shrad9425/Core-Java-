package org.example.main;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {	
		int[] arr = new int[] {30,10,40,20,60,50};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}