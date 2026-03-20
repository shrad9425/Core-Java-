package org.main.example;

import java.util.Scanner;

public class Program6 {	
	private static void printRecord( int[] arr){
		if(arr != null) {
			for(int element : arr) {
				System.out.print(element+" ");
			}
		}System.out.println();
	}
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr1 = {10, 20,30,40};
		Program6.printRecord(arr1);
	}
}