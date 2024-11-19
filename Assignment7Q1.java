package com.sunbeam;



	import java.util.HashMap;
	import java.util.Scanner;

	public class Assignment7Q1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a line of text:");
	        String line = scanner.nextLine();

	        String[] words = line.toLowerCase().split("\\s+"); 
	        HashMap<String, Integer> wordCounts = new HashMap<>();

	        int i = 0;
	        while (i < words.length) {
	            String word = words[i];
	            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
	            i++;
	        }

	        System.out.println("Word occurrences:");
	        for (String word : wordCounts.keySet()) {
	            System.out.println(word + ": " + wordCounts.get(word));
	        }

	        scanner.close();
	    }
	}


	


