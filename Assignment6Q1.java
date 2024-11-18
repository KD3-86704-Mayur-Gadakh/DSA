package com.sunbeam;


	import java.util.Arrays;

	public class Assignment6Q1 {	   
	    private static void minHeapify(int[] arr, int n, int i) {
	        int smallest = i; 
	        int left = 2 * i + 1;
	        int right = 2 * i + 2;

	        if (left < n && arr[left] < arr[smallest]) {
	            smallest = left;
	        }

	        if (right < n && arr[right] < arr[smallest]) {
	            smallest = right;
	        }

	        if (smallest != i) {
	            int temp = arr[i];
	            arr[i] = arr[smallest];
	            arr[smallest] = temp;

	            minHeapify(arr, n, smallest);
	        }
	    }

	    public static void heapSort(int[] arr) {
	        int n = arr.length;

	        int i = n / 2 - 1;
	        while (i >= 0) {
	            minHeapify(arr, n, i);
	            i--;
	        }

	        int size = n; 
	        while (size > 1) {
	            int temp = arr[0];
	            arr[0] = arr[size - 1];
	            arr[size - 1] = temp;

	            size--; 
	            minHeapify(arr, size, 0); 
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {12, 11, 13, 5, 6, 7};

	        System.out.println("Original array: " + Arrays.toString(arr));

	        heapSort(arr);

	        System.out.println("Sorted array: " + Arrays.toString(arr));
	    }
	}


