package org.example.main;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {		
		int[][] arr = new int[3][];
		arr[0] = new int[ ]{1,2,3};
		arr[1] = new int[ ]{5,5};
		arr[2] = new int[ ]{11,22,33,44};
		
		
		//System.out.println(arr);	//[[I@5fd0d5ae
		//toString method
		System.out.println(Arrays.toString(arr[0]));//[1, 2, 3]
		System.out.println(Arrays.toString(arr[1]));//[5, 5]
		System.out.println(Arrays.toString(arr[2]));//[11, 22, 33, 44]
				
		//deepToString method
		System.out.println(Arrays.deepToString(arr));//[[1, 2, 3], [5, 5], [11, 22, 33, 44]]
	}

}
