package com.sunbeam;

import com.sunbeam.*;

import java.util.Scanner;

public class BinarySearch {

    public static int findKey(int[] arr, int key) {

        int low = 0, high = arr.length - 1, mid;
        int count=0;

        while (low <= high) {
        	count++;
            mid = (low + high) / 2;

            if (key == arr[mid]) {
            	
            
            	
                return count;
            } else if (key < arr[mid]) {
            	
                high = mid - 1;
            } else
            	
                low = mid + 1;
        }
    	System.out.println("count "+count);
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the key ");
        int key = sc.nextInt();

        int arr[] = { 1,2,3,4,5,6,7,8,9 };

        int ans = findKey(arr, key);

        if (ans == -1) {
            System.out.println("Element not found ");

        } else {
            System.out.println("count of the binary search" + ans);
        }
    }

}
