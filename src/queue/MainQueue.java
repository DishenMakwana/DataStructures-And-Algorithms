package queue;

public class MainQueue {

	public static void main(String[] args) {
		MyQueue<Integer> q=new MyQueue<>();
		q.enqueue(313);
		q.enqueue(35);
		q.enqueue(53);
		q.enqueue(34);
		q.enqueue(33);
		for(int i=0;i<5;i++)
		{
			System.out.println(q.dequeue());
		}
		System.out.println(q.dequeue());

	}

}
