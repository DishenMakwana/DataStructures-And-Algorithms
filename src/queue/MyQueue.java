package queue;
import linklist.LinkList;
import linklist.LinkList.Node;
public class MyQueue<E>{
	
		private Node<E> front,rear;
		LinkList<E> ld=new LinkList<>();
		public void enqueue(E e)
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
		public E dequeue() 
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
		
		
	
	
}
