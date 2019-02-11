
public class Queue<Type> 
{
	Node2<Type> first = null;
	Node2<Type> lastAdded = null;
	private int size;
	
	public Queue()
	{
		size = 0;
	}
	
	public void push(Type obj)
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
	
	public Type pop()
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
