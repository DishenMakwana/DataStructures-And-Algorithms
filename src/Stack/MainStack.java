package Stack;

public class MainStack {

	public static void main(String[] args) throws Exception {
		MyStack<Integer> ss=new MyStack<>();
		for(int i=0;i<10;i++)
		{
			ss.push(i);
			System.out.println(ss.peek());
		}
		ss.push(4);
		System.out.println(ss.pop());
		System.out.println(ss.peek());
		
		

	}

}
