package org.main.example;

import java.util.Scanner;

public class Program11 {
	private static void acceptRecord(int[][] arr) {
		for(int row=0; row<arr.length; ++row) {
			for(int col=0; col<arr[row].length; ++col) {
				System.out.print("Enter an element	: ");
				arr[row][col]= sc.nextInt();
			}
		}
	}
	private static void printRecord(int[][] arr) {
		for(int row=0; row<arr.length; ++row) {
			for(int col=0; col<arr[row].length; ++col) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] arr = new int[4][3];
		Program11.acceptRecord(arr);
		Program11.printRecord(arr);
	}
}