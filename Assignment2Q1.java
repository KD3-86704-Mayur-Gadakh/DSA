package com.sunbeam;

import java.util.Arrays;

public class Assignment2Q1 {
	

	private static void selectionSort(int[] arr) {

		for(int i=0;i<arr.length-1;i++) {
			int minIndex=i;
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				
				}
				int temp=arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i]=temp;
				
				
			}
		}
	}


	public static void main(String[] args) {

		int arr[]= {65,46,54,76,98,4,6,5};
		
		
		System.out.println("Array Before Sort :"+Arrays.toString(arr));
		
		
		selectionSort(arr);
		
		System.out.println("Arrays After sort :"+Arrays.toString(arr));
		
		
	}

}
