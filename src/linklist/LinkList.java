package linklist;

public class LinkList<E>{
	
	public static class Node<E>{
		public E data;
		public Node<E> next;
		
		public Node(E data)
		 {
			 this.data=data;
			 next=null;
		 }
		
	 }
	
	Node<E> head;
	
	public void add(E data)
	{
		Node<E> toAdd=new Node<E>(data);
		if(isEmpty())
		{
			head=toAdd;
		}
		Node<E> temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		temp.next=toAdd;
		toAdd.next=null;
	}
	
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	void print()
	{
		Node<E> temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	
	void get(int index)
	{
		Node<E> temp=head;
		for(int i=0;i<index;i++)
		{
			temp=temp.next;
		}
		System.out.println(temp.data);
		
	}
	
	void set(int index,E data)
	{
		Node<E> temp=head;
		Node<E> toAdd=new Node<E>(data);
		for(int i=0;i<index-1;i++)
		{
			temp=temp.next;
		}
		toAdd.next=temp.next;
		temp.next=toAdd;
	}
	
	public E removeLast() throws Exception
	{
		if(head==null)
		{
			throw new Exception("empty");
		}
		if(head.next==null)
		{
			Node<E> temp=head;
			head=null;
			return temp.data;
		}
		Node<E> temp=head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		Node<E> El=temp.next;
		temp.next=null;
		return El.data;
			
	}
	
	
	public E displayLast() throws Exception
	{
		Node<E> temp=head;
		if(head==null)
		{
			throw new Exception("empty");
		}
		if(head.next==null)
		{
			return head.data;
		}
		
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		Node<E> El=temp.next;
		return  El.data;
	}
	
	
	

	 

}
