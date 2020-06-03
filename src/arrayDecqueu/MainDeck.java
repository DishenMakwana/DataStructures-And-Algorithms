package arrayDecqueu;

public class MainDeck {

	public static void main(String[] args) {
		MyDeck<Integer> tt=new MyDeck<>();
		tt.enqueueFront(22);
		tt.enqueueFront(33);
		tt.enqueueFront(77);
		tt.enqueueRear(15);
		tt.enqueueRear(17);
		tt.enqueueRear(99);
		System.out.println(tt.dequeueFront());
		System.out.println(tt.dequeuerear());
		System.out.println(tt.dequeueFront());
		System.out.println(tt.dequeuerear());
		System.out.println(tt.dequeueFront());
		System.out.println(tt.dequeuerear());
		System.out.println(tt.dequeueFront());
		System.out.println(tt.dequeuerear());
		tt.enqueueFront(22);
		tt.enqueueFront(33);
		tt.enqueueFront(77);
		tt.enqueueRear(15);
		tt.enqueueRear(17);
		tt.enqueueRear(99);
		System.out.println(tt.dequeueFront());
		System.out.println(tt.dequeuerear());
		System.out.println(tt.dequeueFront());
		System.out.println(tt.dequeuerear());
		System.out.println(tt.dequeueFront());
		System.out.println(tt.dequeuerear());
		
		
		
	}

}
