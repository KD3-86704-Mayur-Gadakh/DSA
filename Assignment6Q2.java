package com.sunbeam;



	import java.util.ArrayList;

	public class Assignment6Q2 {
	    private ArrayList<Integer> heap;

	    public Assignment6Q2() {
	        heap = new ArrayList<>();
	    }

	    public void insert(int value) {
	        heap.add(value);
	        int current = heap.size() - 1;

	        while (current > 0) {
	            int parent = (current - 1) / 2;

	            if (heap.get(parent) < heap.get(current)) {
	                int temp = heap.get(parent);
	                heap.set(parent, heap.get(current));
	                heap.set(current, temp);
	                current = parent;
	            } else {
	                break; 
	            }
	        }
	    }

	    public int extractMax() {
	        if (heap.isEmpty()) {
	            throw new IllegalStateException("Priority Queue is empty!");
	        }

	        int max = heap.get(0); 

	        heap.set(0, heap.get(heap.size() - 1));
	        heap.remove(heap.size() - 1);

	        int current = 0;
	        while (true) {
	            int left = 2 * current + 1;
	            int right = 2 * current + 2;
	            int largest = current;

	            if (left < heap.size() && heap.get(left) > heap.get(largest)) {
	                largest = left;
	            }

	            if (right < heap.size() && heap.get(right) > heap.get(largest)) {
	                largest = right;
	            }

	            if (largest == current) {
	                break;
	            }

	            int temp = heap.get(current);
	            heap.set(current, heap.get(largest));
	            heap.set(largest, temp);

	            current = largest; 
	        }

	        return max; 
	    }

	    public void display() {
	        System.out.println("Heap: " + heap);
	    }

	    public static void main(String[] args) {
	    	Assignment6Q2 pq = new Assignment6Q2();

	        pq.insert(10);
	        pq.insert(20);
	        pq.insert(15);
	        pq.insert(30);
	        pq.insert(25);

	        System.out.println("Priority Queue after insertions:");
	        pq.display();

	        while (true) {
	            try {
	                System.out.println("Extracted Max: " + pq.extractMax());
	                pq.display();
	            } catch (IllegalStateException e) {
	                System.out.println(e.getMessage());
	                break;
	            }
	        }
	    }
	}



