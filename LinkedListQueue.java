
public class LinkedListQueue<Type> 
{
	Node2<Type> first;
	Node2<Type> lastAdded;
	private int size;
	
	public LinkedListQueue()
	{
		size = 0;
		first = null;
		lastAdded = null;
	}
	
	public void enqueue(Type obj)
	{
		if (size == 0)
		{
			first = new Node2<Type>(null, obj);
			lastAdded = first;
			size++;
			return;
		}
		
		lastAdded.setNextNode(new Node2<Type>(null, obj));
		lastAdded = lastAdded.getNextNode();
		size++;
	}
	
	public Type dequeue()
	{
		Type type = first.getValue();
		first = first.getNextNode();
		size--;
		return type;
	}
	
	public Type peek()
	{
		return first.getValue();
	}
	
	public void printQueue()
	{
		Node2<Type> node = first;
		while (node.getNextNode() != null)
		{
			System.out.println(node.getValue());
			node = node.getNextNode();
		}
		System.out.println(node.getValue());
	}

}
