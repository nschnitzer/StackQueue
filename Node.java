//*************************************
// Nathan Schnitzer
// Node.java
//
//
//*************************************

public class Node<Type> 
{
	private Node prev;
	private Type value;
	
	public Node(Node<Type> prevNode, Type val)
	{
		prev = prevNode;
		value = val;
	}
	
	public Node<Type> getPrevNode()
	{
		return prev;
	}
	
	public void setPrevNode(Node<Type> newNode)
	{
		prev = newNode;
	}
	
	public Type getValue()
	{
		return value;
	}

}
