package com.sunbeam;

import java.util.Scanner;

public class Assignment1Q4 {
	
	public  static int findKey(int[] arr, int key) {

		int low=arr.length-1,high=0,mid;
		
		while (high<=low) {
			
			mid=(low+high)/2;
			
			if(key==arr[mid]) {
				return mid;
			}else if(key<arr[mid]) {
				low=mid+1;
			}else {
				high=mid+1;
			}
			
		}
		return -1;
		
	}

	public static void main(String[] args) {

		int arr[]= {9,8,7,6,5,4,3,2};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key :");
		int key=sc.nextInt();
		
		int index=findKey(arr,key);
		
		if(index==-1) {
			System.out.println("index not found");
		}else {
			System.out.println("element found at index "+index);
		}
	}

	

}
