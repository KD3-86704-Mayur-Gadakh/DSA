package com.sunbeam;


class SinglyLinearList{
	
	static class Node{
		private int data;
		private  Node next;
		
		
		public Node(int value) {
			data=value;
			next=null;
		}
		
	}
	
	private Node head;
	
	public SinglyLinearList() {
		head = null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	
	public void addAfterPosition(int value, int pos) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			head = newnode;

		}
		else if(pos <= 1)
			addFirst(value);
		else {
			Node trav = head;
			for(int i = 1 ; i < pos - 1 && trav.next != null; i++)
				trav = trav.next;
			newnode.next = trav.next;
			trav.next = newnode;
		}
	}
	
	public void display() {
		Node trav = head;
		System.out.print("List : ");
		while(trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println();
	}
	
	public void addBeforePosition(int value, int pos) {
		
	}
	
	
	
}



public class Assignment3Q3 {

	public static void main(String[] args) {
		
		
		SinglyLinearList sl=new SinglyLinearList();
		sl.addFirst(10);
		sl.addFirst(20);
		sl.addFirst(30);
		sl.addAfterPosition(50,2);
		sl.addBeforePosition(50,2);
		sl.display();
		
		
		
		
	}

}
