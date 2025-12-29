package com.kodnest.insertionsort;


import java.util.*;

public class InsertionSortApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int arr[] = new int[sc.nextInt()];
		
		for(int i = 0; i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array Element Before Sorting: " + Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("Array Element After Sorting: " + Arrays.toString(arr));
	}
public static void insertionSort(int arr[]) {
	
	for(int i = 1; i <= arr.length-1;i++) {
		int item = arr[i];
		int j = i-1;
		
		while (j >= 0 && arr[j] > item) {
			arr[j+1]=arr[j];
			j--;
		}
		
		arr[j+1]=item;
	}
	
}

}
