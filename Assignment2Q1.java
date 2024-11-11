package com.sunbeam;

import java.util.Arrays;

public class Assignment2Q1 {
	

	private static void selectionSort(int[] arr,int N) {
		for(int i = 1 ; i < N ; i++) {
			int temp = arr[i];
			int j;
			for(j = i - 1 ; j >= 0 && arr[j] < temp ; j--) {
				arr[j+1] = arr[j];
			}
			arr[j + 1] = temp;
				
			}
		
	}


	public static void main(String[] args) {

		int arr[]= {65,46,54,76,98,4,6,5};
		
		
		System.out.println("Array Before Sort :"+Arrays.toString(arr));
		
		
		selectionSort(arr,arr.length);
		
		System.out.println("Arrays After sort :"+Arrays.toString(arr));
		
		
	}

}
