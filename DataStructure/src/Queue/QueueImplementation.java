package Queue;

/**Queue Implementation
 * A Queue is a linear structure which follows a particular order in which the operations are performed.
 * The order is First In First Out (FIFO). 
 * 
 * This Queue implementation covers below functionalities:(FIFO)
 * Push an element in the queue
 * Peek an element in the queue
 * Pop an Element
 * display all elements in the queue
 *  
 * @author Elango
 *
 */

class Queue
{
	
	int[] queue=new int[10];
	int len=0;
	Queue()
	{
		for(int i=0;i<10;i++)
			queue[i]=-1;
	}
	
	public boolean isEmpty()
	{
		if(len==0)
			return true;
		else
			return false;
	}
	public boolean isFull()
	{
		if(len==10)
			return true;
		else
			return false;
	}
public void push(int data)
{
	if(isFull())
		System.out.println("queue is Full");
	else
		queue[len++]=data;
}

public int peek()
{
	
	if(isEmpty())
	{
		System.out.println("queue is Empty");
		return -1;
	}
	else
		return queue[0];
}
public int pop()
{
	int temp=0;
	if(isEmpty())
	{
		System.out.println("List is Empty");
		return -1;
	}
	else
	{
		temp=queue[0];
		
		
		for(int i=1;i<len;i++)
			queue[i-1]=queue[i];
		
		queue[len-1]=-1;
		
		len=len-1;
	}
	
	return temp;
}

public void display()
{
	System.out.print("[");
	for(int i=0;i<len;i++)
		System.out.print(queue[i]+",");
	System.out.print("]");
	System.out.println();
}
}
public class QueueImplementation {
public static void main(String args[])
{
	Queue queue=new Queue();
	queue.push(1);
	queue.push(2);
	queue.push(3);
	queue.push(4);
	queue.push(5);
	System.out.println("Peeking the last element");
	System.out.println(queue.peek());
	System.out.println("Elements in queue after peeking");
	queue.display();
	System.out.println("Poping");
	System.out.println(queue.pop());
	System.out.println("Elements in queue after poping");
	queue.display();
	queue.push(6);
	queue.push(7);
	queue.push(8);
	queue.push(9);
	queue.push(10);
	queue.display();
	queue.push(11);
	System.out.println(queue.pop());
	queue.display();
	System.out.println("Inserting an element in queue which is already full");
	queue.push(12);
	queue.display();
	
	
}
}