package org.main.example;

public class Program2 {
	public static void main(String[] args) {
		//foreach loop
		int[] arr= new int[4];
		for(int element : arr)
			System.out.print(element+" ");
	}
	public static void main3(String[] args) {
		//do-while loop
		int[] arr = new int[3];
		int index = 0;
		do {
			System.out.println("Index of arr ["+ index+ "] is "+ arr[index]);
			index = index + 1;
		}while(index<3);
	}
	public static void main2(String[] args) {
		//for loop
		int[] arr = new int[3];
		for(int index=0; index<3; ++index)
			System.out.println("Index of arr ["+ index+ "] is "+ arr[index]);
		}
	public static void main1(String[] args) {
		int[] arr = new int[4];
		int index = 0;
		//index[0] = 56;
		//index[1] = 60;
		//index[2] = 65;
		//for while loop
		while(index<4) {
			System.out.println("Index of arr ["+ index+ "] is "+ arr[index]);
			index = index +1;
		}
	}
}