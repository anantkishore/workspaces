package com.microsoft.practice.bst;

/*
*
*  Java Program to Implement Binary Search Tree
*/
import java.util.*;

/* Class BSTNode */
class Node
{
    Node left, right;
    int data;

    /* Constructor */
    public Node()
    {
        left = null;
        right = null;
        data = 0;
    }
    /* Constructor */
    public Node(int n)
    {
        left = null;
        right = null;
        data = n;
    }
    /* Function to set left node */
    public void setLeft(Node n)
    {
        left = n;
    }
    /* Function to set right node */ 
    public void setRight(Node n)
    {
        right = n;
    }
    /* Function to get left node */
    public Node getLeft()
    {
        return left;
    }
    /* Function to get right node */
    public Node getRight()
    {
        return right;
    }
    /* Function to set data to node */
    public void setData(int d)
    {
        data = d;
    }
    /* Function to get data from node */
    public int getData()
    {
        return data;
    }     
}

/* Class BST */
class BST
{
    private Node root;

    /* Constructor */
    public BST()
    {
        root = null;
    }
    /* Function to check if tree is empty */
    public boolean isEmpty()
    {
        return root == null;
    }
    /* Functions to insert data */
    public void insert(int data)
    {
        root = insert(root, data);
    }
    /* Function to insert data recursively */
    private Node insert(Node node, int data)
    {
        if (node == null)
            node = new Node(data);
        else
        {
            if (data <= node.getData())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }
    /* Functions to delete data */
    public void delete(int k)
    {
        if (isEmpty())
            System.out.println("Tree Empty");
        else if (search(k) == false)
            System.out.println("Sorry "+ k +" is not present");
        else
        {
            root = delete(root, k);
            System.out.println(k+ " deleted from the tree");
        }
    }
    private Node delete(Node root, int k)
    {
        Node p, p2, n;
        if (root.getData() == k)
        {
            Node lt, rt;
            lt = root.getLeft();
            rt = root.getRight();
            if (lt == null && rt == null)
                return null;
            else if (lt == null)
            {
                p = rt;
                return p;
            }
            else if (rt == null)
            {
                p = lt;
                return p;
            }
            else
            {
                p2 = rt;
                p = rt;
                while (p.getLeft() != null)
                    p = p.getLeft();
                p.setLeft(lt);
                return p2;
            }
        }
        if (k < root.getData())
        {
            n = delete(root.getLeft(), k);
            root.setLeft(n);
        }
        else
        {
            n = delete(root.getRight(), k);
            root.setRight(n);             
        }
        return root;
    }
    /* Functions to count number of nodes */
    public int countNodes()
    {
        return countNodes(root);
    }
    /* Function to count number of nodes recursively */
    private int countNodes(Node r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }
    /* Functions to search for an element */
    public boolean search(int val)
    {
        return search(root, val);
    }
    /* Function to search for an element recursively */
    private boolean search(Node r, int val)
    {
        boolean found = false;
        while ((r != null) && !found)
        {
            int rval = r.getData();
            if (val < rval)
                r = r.getLeft();
            else if (val > rval)
                r = r.getRight();
            else
            {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }
    /* Function for inorder traversal */
    public void inorder()
    {
        inorder(root);
    }
    private void inorder(Node r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() +" ");
            inorder(r.getRight());
        }
    }
    /* Function for preorder traversal */
    public void preorder()
    {
        preorder(root);
    }
    private void preorder(Node r)
    {
        if (r != null)
        {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());             
            preorder(r.getRight());
        }
    }
    /* Function for postorder traversal */
    public void postorder()
    {
        postorder(root);
    }
    private void postorder(Node r)
    {
        if (r != null)
        {
            postorder(r.getLeft());             
            postorder(r.getRight());
            System.out.print(r.getData() +" ");
        }
    }
	public void findKthSmallestElementInBST(int k) 
	{
		modifiedInOrder(root,k);
		count = 0;
	}     
	
	private void modifiedInOrder(Node root, int k)
	{
		if(root == null) 
			return;
		
		modifiedInOrder(root.left, k);
		count++;
		if(count == k) 	
			System.out.println(k+"th smallest element in BST: " + root.data);
		modifiedInOrder(root.right, k);
		
	}
	
	public int findInorderSuccessor(int n)
	{
		Node node = findNode(n);
		if(node.right != null)
			return findMinValue(node.right);
		
		Node temp = root;
		Node succ = null;
		while(temp != null)
		{
			if(n < temp.data)
			{
				succ = temp;
				temp = temp.left;
			}
			else if(n > temp.data)
			{
				succ = temp;
				temp = temp.right;
			}
		}
		return -1;
	}
	
	int findMinValue(Node node)
	{
		while(node.left != null)
			node = node.left;
		return node.data;
	}
	
	static int count = 0;
	
	private Node findNode(Node node, int i)
	{
		if(node != null )
		{
			if(node.data == i )
			{
				return node;
			}
			else if(node.data < i)
			{
				return findNode(node.right, i);
			}
			else
			{
				return findNode(node.left, i);
			}
		}
		return null;
	}

	public Node findNode(int i) 
	{
		return findNode(root, i);
		
	}
	public void levelOrderTraversal() {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.push(new Integer(root.data));
		
		
		
	}
}

/* Class BinarySearchTree */
public class BinarySearchTree
{
//    public static void main(String[] args)
//   {                 
//       Scanner scan = new Scanner(System.in);
//       /* Creating object of BST */
//       BST bst = new BST(); 
//       System.out.println("Binary Search Tree Test\n");          
//       char ch;
//       /*  Perform tree operations  */
//       do    
//       {
//           System.out.println("\nBinary Search Tree Operations\n");
//           System.out.println("1. insert ");
//           System.out.println("2. delete");
//           System.out.println("3. search");
//           System.out.println("4. count nodes");
//           System.out.println("5. check empty\n"); 
//
//           int choice = scan.nextInt();            
//           switch (choice)
//           {
//           case 1 : 
//               System.out.println("Enter integer element to insert");
//               bst.insert( scan.nextInt() );                     
//               break;                          
//           case 2 : 
//               System.out.println("Enter integer element to delete");
//               bst.delete( scan.nextInt() );                     
//               break;                         
//           case 3 : 
//               System.out.println("Enter integer element to search");
//               System.out.println("Search result : "+ bst.search( scan.nextInt() ));
//               break;                                          
//           case 4 : 
//               System.out.println("Nodes = "+ bst.countNodes());
//               break;     
//           case 5 :  
//               System.out.println("Empty status = "+ bst.isEmpty());
//               break;            
//           default : 
//               System.out.println("Wrong Entry \n ");
//               break;   
//           }
//           /*  Display tree  */ 
//           System.out.print("\nPost order : ");
//           bst.postorder();
//           System.out.print("\nPre order : ");
//           bst.preorder();
//           System.out.print("\nIn order : ");
//           bst.inorder();
//
//           System.out.println("\nDo you want to continue (Type y or n) \n");
//           ch = scan.next().charAt(0);                        
//       } while (ch != 'N' || ch != 'n');               
//   }
}