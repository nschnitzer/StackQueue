//****************************************
//Nathan Schnitzer
//StackDriver.java
//11/29/18
//Creates and uses a Stack
//****************************************
public class StackDriver 
{
	public static void main(String[] args) 
	{
		LinkedListStack<Integer> stk = new LinkedListStack<Integer>();
		stk.push(new Integer(5));
		stk.push(new Integer(7));
		stk.printStack();
		System.out.println(stk.peek());
		System.out.println(stk.pop());
		System.out.println(stk.peek());
	}

}

