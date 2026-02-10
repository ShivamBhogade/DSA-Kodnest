package com.kodnest.app.binarysearch;

import java.util.Scanner;

public class ProductPrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of product prices");
		int n = sc.nextInt();
		int price[] = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("Enter price of product " + (i+1));
			price[i] = sc.nextInt();
		}
		System.out.println("Enter the price to be searched");
		int key = sc.nextInt();
		int result = binarySearch(price, key);
		if(result == -1) {
			System.out.println("Price not found");
		}
		else {
			System.out.println("Price found at index: " + result);
		}
		sc.close();

	}
	
	public static int binarySearch(int arr[], int key) {
		
		int low = 0;
		int high = arr.length - 1;
		int mid;
		
		while(low <= high) {
			mid = (low+high)/2;
			if(key == arr[mid]) {
				return mid;
			}
			else if(key > arr[mid]) {
				low = mid + 1;
			}
			else {
				high = high -1;
			}
		}
		
		return -1;
	}

}
