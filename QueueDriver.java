//****************************************
//Nathan Schnitzer
//StackDriver.java
//11/29/18
//Creates and uses a Stack
//****************************************
public class QueueDriver 
{
	public static void main(String[] args) 
	{
		LinkedListQueue<Integer> stk = new LinkedListQueue<Integer>();
		stk.enqueue(new Integer(5));
		stk.enqueue(new Integer(7));
		stk.enqueue(new Integer(9));
		System.out.println();
		stk.printQueue();
		System.out.println();
		System.out.println(stk.peek());
		System.out.println(stk.dequeue());
		System.out.println(stk.peek());
		System.out.println(stk.dequeue());
		System.out.println(stk.peek());
	}

}

