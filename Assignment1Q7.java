package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment1Q7 {
	
	public static int findRank(int[] arr, int rank) {


		
		for(int i=0;i<arr.length;i++) {
			
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
					
				}
				int temp=arr[minIndex];
				arr[minIndex]= arr[i];
				arr[i]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	
		
		int count=0;
		for (int i = 0; i < arr.length; i++) {
		
			if(arr[i]) {
				count++;
				
				if(count) {
					return i;
				}
			}
		}
	
		return -1;
		
		return 0;
	
}

	public static void main(String[] args) {

		int arr[]= {10, 20, 15, 3, 4, 4, 1};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the rank :");
		int rank=sc.nextInt();
		
		int index=findRank(arr,rank);
}

}	
