package linklist;

public class Mainlist {
		public static void main(String[] args) throws Exception{
			
			LinkList<Integer> ll=new LinkList<>();
			ll.add(22);
			ll.add(62);
			ll.add(52);
			ll.add(42);
			ll.add(32);
			ll.removeLast();
			ll.removeLast();
			ll.print();

		}
}
