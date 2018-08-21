/**
 * 
 */
package com.kishore.anant.tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/* Class BSTNode */
class BSTNode {
	BSTNode left, right;
	int data;

	/* Constructor */
	public BSTNode() {
		left = null;
		right = null;
		data = 0;
	}

	/* Constructor */
	public BSTNode(int n) {
		left = null;
		right = null;
		data = n;
	}

	/* Function to set left node */
	public void setLeft(BSTNode n) {
		left = n;
	}

	/* Function to set right node */
	public void setRight(BSTNode n) {
		right = n;
	}

	/* Function to get left node */
	public BSTNode getLeft() {
		return left;
	}

	/* Function to get right node */
	public BSTNode getRight() {
		return right;
	}

	/* Function to set data to node */
	public void setData(int d) {
		data = d;
	}

	/* Function to get data from node */
	public int getData() {
		return data;
	}
}

/* Class BST */
class BST {
	private BSTNode root;

	/* Constructor */
	public BST() {
		root = null;
	}

	/* Function to check if tree is empty */
	public boolean isEmpty() {
		return root == null;
	}

	/* Functions to insert data */
	public void insert(int data) {
		root = insert(root, data);
	}

	/* Function to insert data recursively */
	private BSTNode insert(BSTNode node, int data) {
		if (node == null)
			node = new BSTNode(data);
		else {
			if (data <= node.getData())
				node.left = insert(node.left, data);
			else
				node.right = insert(node.right, data);
		}
		return node;
	}

	/* Functions to delete data */
	public void delete(int k) {
		if (isEmpty())
			System.out.println("Tree Empty");
		else if (search(k) == false)
			System.out.println("Sorry " + k + " is not present");
		else {
			root = delete(root, k);
			System.out.println(k + " deleted from the tree");
		}
	}

	private BSTNode delete(BSTNode root, int k) {
		BSTNode p, p2, n;
		if (root.getData() == k) {
			BSTNode lt, rt;
			lt = root.getLeft();
			rt = root.getRight();
			if (lt == null && rt == null)
				return null;
			else if (lt == null) {
				p = rt;
				return p;
			} else if (rt == null) {
				p = lt;
				return p;
			} else {
				p2 = rt;
				p = rt;
				while (p.getLeft() != null)
					p = p.getLeft();
				p.setLeft(lt);
				return p2;
			}
		}
		if (k < root.getData()) {
			n = delete(root.getLeft(), k);
			root.setLeft(n);
		} else {
			n = delete(root.getRight(), k);
			root.setRight(n);
		}
		return root;
	}

	/* Functions to count number of nodes */
	public int countNodes() {
		return countNodes(root);
	}

	/* Function to count number of nodes recursively */
	private int countNodes(BSTNode r) {
		if (r == null)
			return 0;
		else {
			int l = 1;
			l += countNodes(r.getLeft());
			l += countNodes(r.getRight());
			return l;
		}
	}

	/* Functions to search for an element */
	public boolean search(int val) {
		return search(root, val);
	}

	/* Function to search for an element recursively */
	private boolean search(BSTNode r, int val) {
		boolean found = false;
		while ((r != null) && !found) {
			int rval = r.getData();
			if (val < rval)
				r = r.getLeft();
			else if (val > rval)
				r = r.getRight();
			else {
				found = true;
				break;
			}
			found = search(r, val);
		}
		return found;
	}

	/* Function for inorder traversal */
	public void inorder() {
		inorder(root);
	}

	private void inorder(BSTNode r) {
		if (r != null) {
			inorder(r.getLeft());
			System.out.print(r.getData() + " ");
			inorder(r.getRight());
		}
	}

	/* Function for preorder traversal */
	public void preorder() {
		preorder(root);
	}

	private void preorder(BSTNode r) {
		if (r != null) {
			System.out.print(r.getData() + " ");
			preorder(r.getLeft());
			preorder(r.getRight());
		}
	}

	/* Function for postorder traversal */
	public void postorder() {
		postorder(root);
	}

	private void postorder(BSTNode r) {
		if (r != null) {
			postorder(r.getLeft());
			postorder(r.getRight());
			System.out.print(r.getData() + " ");
		}
	}

	// private void printLeft(BSTNode r) {
	// if (r != null) {
	// postorder(r.getLeft());
	// postorder(r.getRight());
	// System.out.print(r.getData() + " ");
	// }
	// }

	public int findHeight() {
		int height = findHeight(this.root);
		// System.out.println(height);
		return height;
	}

	private int findHeight(BSTNode r) {
		if (r == null) {
			return 1;
		} else {
			int lheight = findHeight(r.left);
			int rheight = findHeight(r.right);
			return (lheight >= rheight) ? lheight + 1 : rheight + 1;
		}
	}

	public void printLeftView() {

		int height = findHeight();
		System.out.println("########################################################################");
		System.out.println("########################################################################\n");

		for (int i = 0; i <= height; i++) {
			printLeft(this.root, i);
		}

	}

	private boolean printLeft(BSTNode root2, int level) {

		if (root2 == null) {
			return false;
		}
		if (level == 0) {
			System.out.println(root2.data);
			return true;
		} else {
			return printLeft(root2.left, level - 1) || printLeft(root2.right, level - 1);
		}
	}

	public void printRightView() {

		int height = findHeight();
		System.out.println("\n########################################################################");
		System.out.println("########################################################################\n");

		for (int i = 0; i <= height; i++) {
			printRight(this.root, i);
		}

	}

	private boolean printRight(BSTNode root2, int level) {

		if (root2 == null) {
			return false;
		}
		if (level == 0) {
			System.out.println(root2.data);
			return true;
		} else {
			return printRight(root2.right, level - 1) || printRight(root2.left, level - 1);
		}
	}

	public void printLevelOrder() {

		Queue<BSTNode> q = new LinkedList<BSTNode>();

		q.add(root);

		while (!q.isEmpty()) {

			BSTNode temp = q.remove();

			System.out.print(temp.data + " ");

			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);

		}

	}

	public void printTopView() {
		printTopView(root);
	}

	class QueueItem implements Comparable<QueueItem> {
		int hDistance;
		BSTNode node;

		public QueueItem(int dist, BSTNode nodeParam) {
			this.hDistance = dist;
			this.node = nodeParam;
		}

		@Override
		public int compareTo(QueueItem o) {

			if (this.hDistance > o.hDistance) {
				return 1;
			} else if (this.hDistance == o.hDistance) {
				return 0;
			} else
				return -1;
		}

		public String toString() {
			return "distance: " + this.hDistance + " data: " + node.data;
		}

	}

	private void printTopView(BSTNode root) {

		Queue<QueueItem> q = new LinkedList<QueueItem>();
		Set<QueueItem> set = new TreeSet<QueueItem>();

		QueueItem qItem = new QueueItem(0, root);
		q.add(qItem);
		set.add(qItem);

		while (!q.isEmpty()) {
			QueueItem temp = q.remove();

			int horizontalDistance = temp.hDistance;

			if (temp.node.left != null) {
				qItem = new QueueItem(horizontalDistance - 1, temp.node.left);
				q.add(qItem);
				set.add(qItem);
			}
			if (temp.node.right != null) {
				qItem = new QueueItem(horizontalDistance + 1, temp.node.right);
				q.add(qItem);
				set.add(qItem);
			}
		}

		Iterator<QueueItem> iterator = set.iterator();
		while (iterator.hasNext()) {
			QueueItem item = iterator.next();
			System.out.print(item.node.data + " ");
		}
	}
}

/* Class BinarySearchTree */
public class BinarySearchTree {

	public static void main(String[] args) {

		BST bst = new BST();
		
		bst.insert(8); 
		bst.insert(3); 
		bst.insert(10); 
		bst.insert(1); 
		bst.insert(6);
		bst.insert(14); 
		bst.insert(4); 
		bst.insert(7); 
		bst.insert(13); 
		bst.insert(12);
		bst.insert(17); 
		bst.insert(15); 
		bst.insert(20); 
		bst.insert(21);
		 
		/*bst.insert(1);
		bst.insert(2);
		bst.insert(5);
		bst.insert(3);
		bst.insert(6);
		bst.insert(4);*/
		// bst.printLeftView();
		// bst.printRightView();
		// bst.printLevelOrder();
		bst.printTopView();
	}
}