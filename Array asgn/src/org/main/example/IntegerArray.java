package org.main.example;

import java.util.Arrays;
import java.util.Scanner;

class Number{
	public static void acceptArrayInt(int[] arr, Scanner sc) {
		for(int index=0; index<arr.length; index++)
			arr[index] = sc.nextInt();
		System.out.println("Array	: "+Arrays.toString(arr));
	}
	public static void displayContent(int[] arr) {
		for(int index=0; index<arr.length; index++) {
			System.out.print(arr[index]+" ");
		}System.out.println();
	}

	public static void calculateSum(int[] arr) {
		int sum =0;
		for(int index=0; index<arr.length; index++){
			sum = arr[index]+sum;
		}
		System.out.print("Sum of all elements	: "+sum);
		System.out.println();
	}

	public static void calculateAverage(int[] arr) {
		int sum =0;
		for(int index=0; index<arr.length; index++) {
			sum = arr[index]+sum;
		}
		int avg = sum/arr.length;
		System.out.print("Average of the array	: "+avg);
		System.out.println();
	}
	public static void largestElement(int[] arr) {
		int max= Integer.MIN_VALUE;
		for(int element:arr) {
			if(element>max) {
				max = element;
			}
		}System.out.print("Largest element	: "+max);
		System.out.println();
	}

	public static void smallestElement(int[] arr) {
		int min= Integer.MAX_VALUE;
		for(int element:arr) {
			if(element<min) {
				min = element;
			}
		}System.out.print("Smallest element	: "+min);
		System.out.println();
	}
	public static void sortedArray(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		}
	}
public class IntegerArray {
	static int menuList() {
		System.out.println("0.Exit	: ");
		System.out.println("1.Accept array of integer	: ");
		System.out.println("2.Display content of an array	: ");
		System.out.println("3.Calculate sum of an array	: ");
		System.out.println("4.Calculate average of an array	: ");
		System.out.println("5.Display the largest element from the array	: ");
		System.out.println("6.Display the smallest element from the array	: ");
		System.out.println("7.Display the sorted array	: ");
		System.out.print("Enter a number	: ");
		return sc.nextInt();
	}
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		int size = sc.nextInt();
		int[] arr = new int[size];
			
		int choice;
		while( (choice = IntegerArray.menuList())!= 0) {
			try {
				switch(choice){
					case 1:
						Number.acceptArrayInt(arr,sc);
						break;
					case 2:
						Number.displayContent(arr);
						break;
					case 3:
						Number.calculateSum(arr);
						break;
					case 4:
						Number.calculateAverage(arr);
						break;
					case 5:
						Number.largestElement(arr);
						break;
					case 6:
						Number.smallestElement(arr);
						break;
					case 7:
						Number.sortedArray(arr);
						break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}