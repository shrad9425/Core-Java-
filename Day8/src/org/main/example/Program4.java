package org.main.example;

public class Program4 {	
	private static void printRecord(int[] arr1) {
		for(int index=0; index<arr1.length; ++index)
			System.out.print(arr1[index]+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2,3,4,5};
		Program4.printRecord(arr1);
		
		int[] arr2= new int[] {20, 30, 50};
		Program4.printRecord(arr2);
		
		int[] arr3 = {1, 20, 8, 5};
		Program4.printRecord(arr3);
	}
}