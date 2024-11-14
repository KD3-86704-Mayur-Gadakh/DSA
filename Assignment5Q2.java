package com.sunbeam;



	class TreeNode {
	    int data;
	    TreeNode left, right;

	    public TreeNode(int data) {
	        this.data = data;
	        this.left = this.right = null;
	    }
	}

	class BinarySearchTreeD {
	    private TreeNode root;

	    public BinarySearchTreeD() {
	        root = null;
	    }

	    public boolean search(int key) {
	        return searchRecursive(root, key);
	    }

	    private boolean searchRecursive(TreeNode node, int key) {
	        if (node == null) {
	            return false;
	        }

	        if (key == node.data) {
	            return true;
	        }

	        if (key < node.data) {
	            return searchRecursive(node.left, key);
	        } else {
	            return searchRecursive(node.right, key);
	        }
	    }

	    public void insert(int data) {
	        root = insertRecursive(root, data);
	    }

	    private TreeNode insertRecursive(TreeNode node, int data) {
	        if (node == null) {
	            return new TreeNode(data);
	        }
	        if (data < node.data) {
	            node.left = insertRecursive(node.left, data);
	        } else if (data > node.data) {
	            node.right = insertRecursive(node.right, data);
	        }
	        return node;
	    }
	}

	public class Assignment5Q2 {
	    public static void main(String[] args) {
	    	BinarySearchTreeD bst = new BinarySearchTreeD();
	        
	        bst.insert(50);
	        bst.insert(30);
	        bst.insert(70);
	        bst.insert(20);
	        bst.insert(40);
	        bst.insert(60);
	        bst.insert(80);

	        System.out.println("Search 40: " + bst.search(40)); 
	        System.out.println("Search 25: " + bst.search(25));
	    }
	}


