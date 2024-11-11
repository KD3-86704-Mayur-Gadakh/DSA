package com.sunbeam;



class LinearQueue{
	int arr[];
	int front,rare;
	final int SIZE;
	
	public LinearQueue(int size) {
		SIZE=size;
		front=rare=0;
		arr=new int[SIZE];
	}
	
	public void push(int value) {
		rare++;
		arr[rare]=value;
		
	}
	
	public int pop() {
		int popValue=arr[rare];
		front++;
		
		return popValue;
	}
	
	public int peek() {
		int peekedValue=arr[front];
		return peekedValue;
	}
	
	public boolean isFull() {
		if(rare==SIZE+1) {
			return true;
		}
	return false;	
	}
	
	public boolean isEmpty() {
		if(front==rare) {
			return true;
		}
		else {
			return false;
		}
	}
	
}


public class Assignment2Q3 {


	
	
	public static void main(String[] args) {
	
		LinearQueue lq=new LinearQueue(5);
		
		lq.push(5);
		lq.push(2);
		lq.push(1);
		lq.push(4);
		lq.push(3);
		System.out.println("poped Element"+lq.pop());
		System.out.println("peeked Element"+lq.peek());
		
		if(lq.isFull()) {
			System.out.println("Linear Queue is full");
		}else {
			System.out.println("Linear Queus is not full");
		}
		
		if(lq.isEmpty()) {
			System.out.println("Quesue is Empty");
		}else {
			System.out.println("Queue is not empty");
		}
		
	}

}
