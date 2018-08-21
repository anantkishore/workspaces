/**
 * 
 */
package com.microsoft.practice.bst;

/**
 * @author i351596
 *
 */
public class LevelOrderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BST bst = new BST();
		bst.insert(1);
		bst.insert(2);
		bst.insert(3);
		bst.insert(4);
		bst.insert(5);
		bst.insert(6);
		bst.insert(7);
		
		bst.levelOrderTraversal();
	}

}
