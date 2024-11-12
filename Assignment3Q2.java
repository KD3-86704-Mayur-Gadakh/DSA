package com.sunbeam;


class CircularQueue{
	
int SIZE;
	int rare,front=-1;
	int arr[]; 
	int count;
	public void circularQueue(int size) {
		SIZE=size;
		arr=new int[SIZE];
		front=rare=-1;
	}
	
	public void push(int value) {
	
		rare=(rare+1)%SIZE;
		arr[rare]=value;
		count++;
	}
	
	public int pop() {
		int temp = arr[(front + 1) % SIZE];
		front =(front+1)%SIZE;
		
		if(front==rare) {
			front =rare=-1;
		}
		
		count--;
		return temp;		
	}
	
	public boolean isEmpty() {
		return count==0;
	}
	
	public boolean isFull() {
		return count==SIZE;
	}
}


public class Assignment3Q2 {

	public static void main(String[] args) {
		
		CircularQueue cq=new CircularQueue();
		cq.circularQueue(5);
//		cq.push(10);
//		cq.push(20);
//		cq.push(20);
//		cq.push(20);
//		cq.push(20);
		
		if(cq.isEmpty()) {
			System.out.println("The Queue is Empty");
		}
		
		if(cq.isFull()) {
			System.out.println("The Queue if Full");
		}
	

	}

}
