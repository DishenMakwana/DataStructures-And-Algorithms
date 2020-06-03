package Stack;

import linklist.LinkList;

public class MyStack<E>{
	private LinkList<E> ll=new LinkList<>();
	void push(E e)
	{
		ll.add(e);
	}
	E pop() throws Exception
	{
		if(ll.isEmpty())
		{
			throw new Exception("poping is not done bcoz stack is empty");
		}
		return ll.removeLast();
		
	}
	E peek() throws Exception
	{
		return ll.displayLast();
		
	}
	

}
