package mypackage;

public class DoubleNode<T> {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			throw new UnsupportedOperationException("Hello!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	//initialize elements
	public T item;
	public DoubleNode<T> next;
	public DoubleNode<T> previous;
	
	//add methods
	public void addFirst(DoubleNode<T> linkedlist,DoubleNode<T> obj)
	{
		if(linkedlist==null)
		{
			linkedlist=obj;
		}
		else
		{
			obj.next=linkedlist;
			linkedlist.previous=obj;
			linkedlist=obj;
		}
	}
	public void addLast(DoubleNode<T> linkedlist,DoubleNode<T> obj)
	{
		DoubleNode<T> lastNode=linkedlist;
		
		if(linkedlist==null)
		{
			linkedlist=obj;
		}
		else
		{
			while(lastNode.next!=null)
			{
				lastNode=linkedlist.next;
			}
			lastNode.next=obj;
			obj.previous=lastNode;
		}
	}
	public void removeFirst(DoubleNode<T> linkedlist) throws UnsupportedOperationException
	{
		if(linkedlist==null)
		{
			throw new UnsupportedOperationException("The First Node Is NULL.");
		}
		else
		{
			linkedlist=linkedlist.next;
			linkedlist.previous=null;
		}
	}
	public void removeLast(DoubleNode<T> linkedlist) throws UnsupportedOperationException
	{
		DoubleNode<T> lastNode=linkedlist;
		
		if(linkedlist==null)
		{
			throw new UnsupportedOperationException("The Last Node Is NULL.");
		}
		else
		{
			while (linkedlist.next!=null) {
				lastNode=linkedlist.next;
			}
			lastNode=null;
		}
	}

}
