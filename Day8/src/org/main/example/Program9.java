package org.main.example;

import java.util.Arrays;

public class Program9 {
	public static void main(String[] args) {
		int[] arr = {60,30,80,20,70};
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}