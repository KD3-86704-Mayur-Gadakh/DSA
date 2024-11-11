package com.sunbeam;

import java.util.Scanner;

public class linearSearch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the key");
		int key=sc.nextInt();
		
		int arr[]= {12,34,56,76,4,5,3};
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			count=count+1;
			if(key==arr[i]) {
				
				System.out.println("Found at index"+arr[i]);
				System.out.println("count "+count);
			}
			
		}
		
		

	}

}
