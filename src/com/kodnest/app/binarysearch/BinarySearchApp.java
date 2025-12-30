package com.kodnest.app.binarysearch;

import java.util.Scanner;
public class BinarySearchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}	
		
		int key = sc.nextInt();
		insertionSort(arr);
		int result = binarySearch(arr, key);
		if(result == -1)
			System.out.println("Element " + key + " not found in the array.");
		else	
		System.out.println("Element " + key + " found at index: " + result);
	}
	
	public static void insertionSort(int[] arr) {
		
		    for (int i = 1; i < arr.length; i++) {
			int item = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > item) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = item;
		}
	}
	
	public static int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
}
