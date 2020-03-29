package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**Binary Tree Implementation
 * A binary tree is a recursive data structure where each node can have 2 children at most.
 *  
 * @author Elango
 *
 */
class binarytree {
	
	static class Node
	{
		Node left,right;
		int data;
		
		Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	static Node root; 
    static Node temp = root; 
    
    static void inorder(Node temp) 
    { 
        if (temp == null) 
            return; 
       
        inorder(temp.left); 
        System.out.print(temp.data+" "); 
        inorder(temp.right); 
    } 
       

    static void insert(Node temp, int data) 
    { 
        Queue<Node> q = new LinkedList<Node>(); 
        q.add(temp); 
  
        while (!q.isEmpty()) { 
            temp = q.peek(); 
            q.remove(); 
       
            if (temp.left == null) { 
                temp.left = new Node(data); 
                break; 
            } else
                q.add(temp.left); 
       
            if (temp.right == null) { 
                temp.right = new Node(data); 
                break; 
            } else
                q.add(temp.right); 
        	}
    }
	public static void main(String args[])
	{
		 root = new Node(1); 
	        root.left = new Node(2); 
	        root.left.left = new Node(3); 
	        root.right = new Node(4); 
	        root.right.left = new Node(5); 
	        root.right.right = new Node(8); 
	       
	        System.out.print( "Inorder traversal before insertion:"); 
	        inorder(root); 
	       
	        int key = 12; 
	        insert(root, key); 
	       
	        System.out.print("\nInorder traversal after insertion:"); 
	        inorder(root); 
	}
}

