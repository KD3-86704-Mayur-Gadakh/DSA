package com.sunbeam;



	class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class CircularLinkedListDemo {
	    private Node tail;

	    public CircularLinkedListDemo() {
	        this.tail = null;
	    }

	    // Insert at the end of the list
	    public void insertEnd(int data) {
	        Node newNode = new Node(data);
	        if (tail == null) { // List is empty
	            tail = newNode;
	            tail.next = tail;
	        } else {
	            newNode.next = tail.next; // New node points to the first node
	            tail.next = newNode; // Old tail points to new node
	            tail = newNode; // Update tail to new node
	        }
	    }

	    // Insert at the beginning of the list
	    public void insertBeginning(int data) {
	        Node newNode = new Node(data);
	        if (tail == null) { // List is empty
	            tail = newNode;
	            tail.next = tail;
	        } else {
	            newNode.next = tail.next; // New node points to the first node
	            tail.next = newNode; // Tail points to new node
	        }
	    }

	    // Delete a node with a given key
	    public void delete(int key) {
	        if (tail == null) return; // List is empty

	        Node current = tail.next;
	        Node prev = tail;
	        do {
	            if (current.data == key) {
	                if (current == tail && current.next == tail) { // Only one node
	                    tail = null;
	                } else {
	                    prev.next = current.next;
	                    if (current == tail) {
	                        tail = prev; // Update tail if deleting the last node
	                    }
	                }
	                return;
	            }
	            prev = current;
	            current = current.next;
	        } while (current != tail.next);
	    }

	    // Traverse the list and print each element
	    public void display() {
	        if (tail == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        Node current = tail.next;
	        do {
	            System.out.print(current.data + " ");
	            current = current.next;
	        } while (current != tail.next);
	        System.out.println();
	    }
	}

	public class Assignment4Q1 {
	    public static void main(String[] args) {
	    	CircularLinkedListDemo list = new CircularLinkedListDemo();

	        list.insertEnd(10);
	        list.insertEnd(20);
	        list.insertBeginning(5);
	        list.insertEnd(30);	    
	        list.delete(20);
	        list.delete(5);
	        list.display();
	    }
	

	

	}


