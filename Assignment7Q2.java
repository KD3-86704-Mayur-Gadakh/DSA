package com.sunbeam;



	import java.util.HashMap;

	public class Assignment7Q2 {
	    public static void main(String[] args) {
	        int[] array = {1, 3, 3, 7, 2, 3, 7, 7, 7, 2};

	        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
	        for (int num : array) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }

	        int mode = array[0];
	        int maxCount = 0;

	        for (int num : frequencyMap.keySet()) {
	            int count = frequencyMap.get(num);
	            if (count > maxCount) {
	                maxCount = count;
	                mode = num;
	            }
	        }

	        System.out.println("Mode of the array: " + mode);
	    }
	}



