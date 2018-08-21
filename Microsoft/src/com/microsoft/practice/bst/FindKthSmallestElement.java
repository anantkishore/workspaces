/**
 * 
 */
package com.microsoft.practice.bst;

/**
 * @author i351596
 *
 */
public class FindKthSmallestElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		BST bst = new BST();
		bst.insert(20);
		bst.insert(22);
		bst.insert(8);
		bst.insert(4);
		bst.insert(12);
		bst.insert(10);
		bst.insert(14);

		bst.inorder();
		System.out.println("\n");
		
		bst.findKthSmallestElementInBST(14);
		
		
		System.out.println(bst.findInorderSuccessor(8));
		
		
		
		
	}

}
