package org.example.main;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	private static int[][] getArray( ) {
		int[][] arr = new int[3][];
		arr[0] = new int[3]; 
	    arr[1] = new int[5]; 
	    arr[2] = new int[2];
	    return arr;
	}
	private static void acceptRecord(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for(int col = 0; col< arr[row].length; col++) {
				System.out.print("arr ["+row+"]["+col+"] : ");
				arr[row][col] = sc.nextInt();
				}
		}
	}
	private static  void printRecord(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for(int col = 0; col< arr[row].length; col++) {
				System.out.print(arr[row][col]+" ");
				}
			System.out.println( );
			}
	}
	public static void main(String[] args) {	
		int[][] arr = Program.getArray( );
		Program.acceptRecord(arr);
		Program.printRecord(arr);
	}
}