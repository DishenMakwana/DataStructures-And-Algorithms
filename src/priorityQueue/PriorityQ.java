package priorityQueue;

import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq=new PriorityQueue<>(); 
		pq.add("Apple");
		pq.add("apple");
		pq.add("Gvava");
		pq.add("Banana");
		pq.add("Orange");
			System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
			System.out.println(pq);
	}

}
