package com.sunbeam;



	class TreeNode {
	    int data;
	    TreeNode left, right;

	    public TreeNode(int data) {
	        this.data = data;
	        this.left = this.right = null;
	    }
	}

	class BinarySearchTreeDemo {
	    private TreeNode root;

	    public BinarySearchTreeDemo() {
	        root = null;
	    }

	    public void insert(int data) {
	        root = insertRecursive(root, data);
	    }

	    private TreeNode insertRecursive(TreeNode node, int data) {
	        if (node == null) {
	            node = new TreeNode(data);
	            return node;
	        }

	        if (data < node.data) {
	            node.left = insertRecursive(node.left, data); 
	        } else if (data > node.data) {
	            node.right = insertRecursive(node.right, data); 
	        }

	        return node; 
	    }

	    public void inorderTraversal() {
	        inorderRecursive(root);
	        System.out.println();
	    }

	    private void inorderRecursive(TreeNode node) {
	        if (node != null) {
	            inorderRecursive(node.left);
	            System.out.print(node.data + " ");
	            inorderRecursive(node.right);
	        }
	    }
	}

	public class Assignment5Q1 {
	    public static void main(String[] args) {
	    	BinarySearchTreeDemo bst = new BinarySearchTreeDemo();
	        
	        bst.insert(50);
	        bst.insert(30);
	        bst.insert(70);
	        bst.insert(20);
	        bst.insert(40);
	        bst.insert(60);
	        bst.insert(80);

	        System.out.print("Inorder Traversal of BST: ");
	    }
	}


