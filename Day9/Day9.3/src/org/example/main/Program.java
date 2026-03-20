package org.example.main;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][];
		arr[0] = new int[] { 1, 2, 3 }; 
	    arr[1] = new int[] { 4, 5, 6, 7, 8 }; 
	    arr[2] = new int[] { 9, 10 }; 
	    
	    int index = 0;
		while(index < 3) {
			System.out.print(Arrays.toString(arr[index])+" ");
			index = index + 1;
		}System.out.println( );
}
	
	public static void main3(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][];
		arr[0] = new int[] { 1, 2, 3 }; 
	    arr[1] = new int[] { 4, 5, 6, 7, 8 }; 
	    arr[2] = new int[] { 9, 10 }; 
	    
	    int index = 0;
		do {
			System.out.print(Arrays.toString(arr[index])+" ");
			index = index +1;
		}while(index < 3);
		System.out.println( );
	}
	
	public static void main2(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][];
		arr[0] = new int[] { 1, 2, 3 }; 
	    arr[1] = new int[] { 4, 5, 6, 7, 8 }; 
	    arr[2] = new int[] { 9, 10 }; 
	    
		for(int[] row : arr) {
			for(int col: row) {
				System.out.print(col+" ");
			}System.out.println( );
		}
	}
	public static void main1(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][];
		arr[0] = new int[ ]{1,2,3};
		arr[1] = new int[ ]{5,5};
		arr[2] = new int[ ]{11,22,33,44};
		
		for(int index = 0; index <3; index++)
			System.out.println(Arrays.toString(arr[index]));	
	}
}