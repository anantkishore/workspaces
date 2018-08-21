class Node{
	
	int data;
	Node left , right;
	public Node(int data){
		this.data = data;
		left = right = null;
	}
	
}
public class Tree {
	
	public static void Inorder(Node root)
	{
		if(root!=null)
		{
			Inorder(root.left);
			System.out.println(root.data);
			Inorder(root.right);
		}
	}
	public static Node BuildTree(int arr[] , int start , int end)
	{
		if(start > end)
			return null;
		int mid = (start + end)/2;
		Node root  = new Node(arr[mid]);
		
		root.left = BuildTree(arr, start, mid-1);
		root.right = BuildTree(arr, mid+1, end);
		return root;
	}
		public static void main (String args[])
		{
			int arr[] = {1,2,3,4,5,6,7,8};
			int start = 0 , end = 7;
			Node tree = BuildTree(arr, start, end);
			Inorder(tree);
			
		}
}
