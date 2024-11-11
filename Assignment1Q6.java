package com.sunbeam;

import java.util.Scanner;

public class Assignment1Q6 {
	
	
	public static int findIndex(int[] arr,int n) {
		
		
			for (int i = 0; i < n; i++) {
				int j;
				for ( j = 0; j < n; j++)
					if (i != j && arr[i] == arr[j])
						break;
				if (j == n)
					return arr[i];
			}

			return -1;
		
		
		
		
	}

	public static void main(String[] args) {
		int arr[]= { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		
		
int ans=findIndex(arr,arr.length);
	
System.out.println(ans);
	}

	

}
