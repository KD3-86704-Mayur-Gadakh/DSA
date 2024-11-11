package com.sunbeam;

import java.util.Iterator;
import java.util.Scanner;

public class LinearSearch1 {
	
	private static int findLastOccurance(int[] arr, int key) {
		// TODO Auto-generated method stub
		
		for (int i = arr.length-1; i >=0; i--) {
			if(key==arr[i]) {
				return i;
			}
			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the key :");
		int key=sc.nextInt();
		int arr[]= {1,4,7,4,5,6,8,2,1,3,3,4};
		
		
		
		int index=findLastOccurance(arr,key);
		
		if(index==-1) {
			System.out.println("Not Found");
		}else {
			System.out.println("last occurance of the element :"+index);
		}
	}

	

}
