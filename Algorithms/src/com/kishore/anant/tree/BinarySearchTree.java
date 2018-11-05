package com.kishore.anant.tree;

public class BinarySearchTree {
	
	Node root;
	
	public BinarySearchTree()
	{
		this.root = null;
	}
	
	public void insert(int data)
	{
		if(root == null)
		{
			Node node = new Node(data);
			this.root = node;
			
		}
		else
			insert(this.root, data, this.root);
		
	}
	
	public void insert(Node node, int data, Node prev)
	{
		if(node.data < data && node.right.data > data)
			prev = node;
			
		
		if(node.data < data)
			insert(node.right, data, node);
		else if(node.data < data)
			insert(node.left, data, node);
		else
			return;
			
	}
	
	
}

class Node {
	
	int data;
	Node left;
	Node right;
	
	public Node(int data)
	{
		this.data = data;
	}
}