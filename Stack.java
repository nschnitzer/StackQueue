
public class Stack<Type> 
{
	Node<Type> last = null;
	private int size;
	
	public Stack()
	{
		size = 0;
	}
	
	public void push(Type obj)
	{
		if (size == 0)
		{
			last = new Node<Type>(null, obj);
			size++;
			return;
		}
		
		last = new Node<Type>(last, obj);
		size++;
	}
	
	public Type pop()
	{
		Type type = last.getValue();
		last = last.getPrevNode();
		size--;
		return type;
	}
	
	public Type peek()
	{
		return last.getValue();
	}
	
	public void printStack()
	{
		Node<Type> node = last;
		while (node.getPrevNode() != null)
		{
			System.out.println(node.getValue());
			node = node.getPrevNode();
		}
		System.out.println(node.getValue());
	}

}
