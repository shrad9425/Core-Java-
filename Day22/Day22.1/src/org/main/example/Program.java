package org.main.example;

public class Program {

	public static int linearSearch(int[] arr,int key) {
		for(int i=0; i<arr.length; i++)
			if( arr[i] == key ) 
				return i;
			return -1;
	}
	public static int binarySearch(int[] arr, int key) {
		int left =0;
		int right = arr.length-1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			if(arr[mid] == key)
				return mid;
			else if(arr[mid] < key)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
			
	} 
	
	public static void main(String[] args) {
		int[] arr = new int[] {50,20,10,40,30};
		int key = 30;
		//int i = Program.linearSearch(arr, key);
		int i = Program.binarySearch(arr, key);
		if(i != -1) {
			System.out.println(key+" is found at index "+i);
		}else {
			System.out.println(key +" is not found");
		}
	}
}
