package org.main.example;

import java.util.Scanner;

public class Program5 {	
	private static void acceptRecord(int[] arr) { 
		if( arr != null ) { 
		for( int index = 0; index < arr.length; ++ index ) { 
		        System.out.print("Enter element : ");
		        arr[ index ] = sc.nextInt(); 
		      } 
		    } 
		  } 
		private static void printRecord(int[] arr) { 
		if( arr != null ) { 
		for( int index = 0; index < arr.length; ++ index ) 
		        System.out.print( arr[ index ]+" ");
		}  
		System.out.println();
	} 
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//int[] arr1 = null;
		int[] arr1 = new int[4];
		Program5.acceptRecord(arr1);
		Program5.printRecord(arr1);
		
	}
	
	public static void main1(String[] args) {
		//int size = sc.nextInt();
		int[] arr1 = new int[4];
		for(int index=0; index<4; index++) {
			System.out.print("Enter an element: ");
			arr1[index] = sc.nextInt();
			}
		Program5.acceptRecord(arr1);
		Program5.printRecord(arr1);
		
	}
}