package Stack;

/**Stack Implementation
 * Stack is a linear data structure which follows a particular order in which the operations are performed.
 * The order may be LIFO(Last In First Out) or FILO(First In Last Out).
 * 
 * This Stack implementation covers below functionalities:(LIFO)
 * Push an element in the stack
 * Peek an element in the stack
 * Pop an Element
 * display all elements in the stack
 *  
 * @author Elango
 *
 */

class Stack
{
	
	int[] stack=new int[10];
	int len=0;
	Stack()
	{
		for(int i=0;i<10;i++)
			stack[i]=-1;
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
		System.out.println("Stack is Full");
	else
		stack[len++]=data;
}

public int peek()
{
	
	if(isEmpty())
	{
		System.out.println("Stack is Empty");
		return -1;
	}
	else
		return stack[len-1];
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
		temp=stack[len-1];
		stack[len-1]=-1;
		len=len-1;
	}
	
	return temp;
}

public void display()
{
	System.out.print("[");
	for(int i=0;i<len;i++)
		System.out.print(stack[i]+",");
	System.out.print("]");
	System.out.println();
}
}
public class StackImplementation {
public static void main(String args[])
{
	Stack stack=new Stack();
	stack.push(1);
	stack.push(2);
	stack.push(3);
	stack.push(4);
	stack.push(5);
	System.out.println("Peeking the last element");
	System.out.println(stack.peek());
	System.out.println("Elements in stack after peeking");
	stack.display();
	System.out.println("Poping");
	System.out.println(stack.pop());
	System.out.println("Elements in stack after poping");
	stack.display();
	stack.push(6);
	stack.push(7);
	stack.push(8);
	stack.push(9);
	stack.push(10);
	stack.display();
	stack.push(11);
	stack.display();
	System.out.println("Inserting an element in stack which is already full");
	stack.push(12);
	
	
}
}