package com.sunbeam;

import java.util.Scanner;

public class Assignment1Q5 {
	
	
	public static int findKey(int arr[],int key,int occurance) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
		
			if(key==arr[i]) {
				count++;
				
				if(count==occurance) {
					return i;
				}
			}
		}
	
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,4,7,8,4,9,2,4};
		System.out.println("Enter the key :");
		int key=sc.nextInt();
		System.out.println("Enter the occurenace:");
		int occurance=sc.nextInt();
		int index=findKey(arr,key,occurance);
		System.out.println("index of ocurance is "+index);
		
		
		
	}

}
