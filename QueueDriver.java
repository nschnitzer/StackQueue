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
		Queue<Integer> stk = new Queue<Integer>();
		stk.push(new Integer(5));
		stk.push(new Integer(7));
		stk.push(new Integer(9));
		System.out.println();
		stk.printQueue();
		System.out.println();
		System.out.println(stk.peek());
		System.out.println(stk.pop());
		System.out.println(stk.peek());
		System.out.println(stk.pop());
		System.out.println(stk.peek());
	}

}

