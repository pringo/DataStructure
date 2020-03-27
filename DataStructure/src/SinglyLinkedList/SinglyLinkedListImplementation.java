package SinglyLinkedList;

/**Singly Linked List Implementation
 * A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations.
 * This Singly Linked List implementation covers below functionalities:
 * Insert an element in the list
 * Insert at specified position
 * Delete an Element
 * display all elements in the list
 *  
 * @author Elango
 *
 */

class Node {
	
	Node next;
	int data;
	
	public Node(int data)
	{
		this.data=data;
		next=null;
	}
	

}

class SinglyLinkedList
{
	public Node head;
	
	public boolean isEmpty()
	{
		if(head==null)
			return true;
		else
			return false;
	}
	
	public void insert(int data)
	{
		Node node=new Node(data);
		Node cur=head;
		if(head==null)
			head=node;
		
		else
		{
			while(cur.next!=null)
				cur=cur.next;
				
			cur.next=node;
		}
			
	}
	
	public void display()
	{
		Node cur=head;
		if(isEmpty())
			System.out.println("List is Empty");
		else
		{
			while(cur!=null)
			{
				System.out.println(cur.data);
				cur=cur.next;
			}
		}
	}

	public void insertAtPos(int data, int pos)
	{
		Node node=new Node(data);
		Node cur=head;
		if(length()<pos)
			System.out.println("Invalid Position");
		else
		{
			for(int i=1;i<pos-1;i++)
				cur=cur.next;
			
			node.next=cur.next;
			cur.next=node;
		}
	}
	public int length()
	{
		int len=0;
		Node cur=head;
		if(head==null)
			return 0;
		else
		{
			while(cur!=null)
			{
				len=len+1;
				cur=cur.next;
			}
			return len;
		}
	}
	
	public void delete(int pos)
	{
		Node cur=head;
		if(length()<pos)
			System.out.println("Invalid position");
		else
		{
			for(int i=1;i<pos-1;i++)
				cur=cur.next;
			
			cur.next=cur.next.next;
		}
	}
}
public class SinglyLinkedListImplementation
{
	public static void main(String args[])
	{
		SinglyLinkedList list=new SinglyLinkedList();
		list.insert(1);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.display();
		list.insertAtPos(2, 2);
		list.display();
		list.delete(3);
		list.display();
		
		
	}
}