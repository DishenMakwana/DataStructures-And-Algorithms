package arrayDecqueu;


import linklist.LinkList;
import linklist.LinkList.Node;

public class MyDeck<E>{
	LinkList<E> dec = new LinkList<>();
	Node<E> front,rear;
	public void enqueueRear(E e)
	{
		Node<E> toAdd=new Node<>(e);
		if(front==null)
		{
			front=rear=toAdd;
			return;
			
		}
		rear.next=toAdd;
		rear=rear.next;
	}
	public E dequeueFront() 
	{
		
		if(front==null)
		{
			return null;
		}
		
		Node<E> toRemove=front;
		front=front.next;
		if(front==null)
		{
			rear=null;
		}
		return toRemove.data;
		
	}
	
	public void enqueueFront(E e)
	{
		Node<E> toAdd=new Node<>(e);
		if(front==null)
		{
			front=rear=toAdd;
			return;
			
		}
		toAdd.next=front;
		front=toAdd;
	}
	public E dequeuerear() 
	{
		
		if(front==null)
		{
			return null;
		}
		
		Node<E> toRemove=rear;
		
		Node<E> temp=front;
		if(front.next==null)
		{
			Node<E> toRemove1=front;
			front=rear=null;
			return toRemove1.data;
		}
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		rear=temp;
		temp.next=null;
		return toRemove.data;
		
	}
	
	

}
