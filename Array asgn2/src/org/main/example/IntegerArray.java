package org.main.example;

import java.util.Arrays;
import java.util.Scanner;

class Number {
    public static void displayContent(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty!");
            return;
        }
        System.out.println("Array elements: " + Arrays.toString(arr));
    }
    
    public static void populateArray(int[] arr, Scanner sc) {
        if (arr == null) return;
        System.out.println("Enter " + arr.length + " elements:");
        for(int index = 0; index < arr.length; index++) {
            System.out.print("Element " + (index + 1) + ": ");
            arr[index] = sc.nextInt();
        }
        System.out.println("Array populated successfully!");
    }
    
    public static int calculateSum(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        return sum;
    }
    
    public static double calculateAverage(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int sum = calculateSum(arr);
        return (double) sum / arr.length;
    }
    
    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("Array is empty!");
        }
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    
    public static int findSmallest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("Array is empty!");
        }
        int smallest = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    
    public static void displaySorted(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty!");
            return;
        }
        int[] sortedArr = arr.clone(); // Create copy to preserve original
        Arrays.sort(sortedArr);
        System.out.println("Sorted array: " + Arrays.toString(sortedArr));
    }
}

public class IntegerArray {
    static Scanner sc = new Scanner(System.in);
    private static int[] array = null;
    
    static int menuList() {
        System.out.println("\n=== ARRAY OPERATIONS MENU ===");
        System.out.println("0. Exit");
        System.out.println("1. Create/Populate Array");
        System.out.println("2. Display Content of Array");
        System.out.println("3. Calculate Sum of Array");
        System.out.println("4. Calculate Average of Array");
        System.out.println("5. Display Largest Element");
        System.out.println("6. Display Smallest Element");
        System.out.println("7. Display Sorted Array");
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }
    
    public static void main(String[] args) {
        int choice;
        
        while((choice = menuList()) != 0) {
            try {
                switch(choice) {
                    case 1:
                        System.out.print("Enter array size: ");
                        int size = sc.nextInt();
                        if(size <= 0) {
                            System.out.println("Size must be positive!");
                            break;
                        }
                        array = new int[size];
                        Number.populateArray(array, sc);
                        break;
                        
                    case 2:
                        if(!isArrayReady()) break;
                        Number.displayContent(array);
                        break;
                        
                    case 3:
                        if(!isArrayReady()) break;
                        int sum = Number.calculateSum(array);
                        System.out.println("Sum of array: " + sum);
                        break;
                        
                    case 4:
                        if(!isArrayReady()) break;
                        double average = Number.calculateAverage(array);
                        System.out.printf("Average of array: %.2f\n", average);
                        break;
                        
                    case 5:
                        if(!isArrayReady()) break;
                        int largest = Number.findLargest(array);
                        System.out.println("Largest element: " + largest);
                        break;
                        
                    case 6:
                        if(!isArrayReady()) break;
                        int smallest = Number.findSmallest(array);
                        System.out.println("Smallest element: " + smallest);
                        break;
                        
                    case 7:
                        if(!isArrayReady()) break;
                        Number.displaySorted(array);
                        break;
                        
                    default:
                        System.out.println("Invalid choice! Please enter 0-7.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine(); // Clear scanner buffer
            }
        }
        System.out.println("Thank you for using the program. Goodbye!");
        sc.close();
    }
    
    private static boolean isArrayReady() {
        if(array == null) {
            System.out.println("Please create array first (Option 1)!");
            return false;
        }
        return true;
    }
}