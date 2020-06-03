package Stack;

import java.util.*;

public class CylinderStack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3;
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		Stack<Integer> a=new Stack<>();
		Stack<Integer> b=new Stack<>();
		Stack<Integer> c=new Stack<>();
		int tota=0,totb=0,totc=0;
		for(int i=0;i<n1;i++)
		{
			tota+=sc.nextInt();
			a.push(tota);
		}
		for(int i=0;i<n2;i++)
		{
			totb+=sc.nextInt();
			b.push(totb);
		}
		for(int i=0;i<n3;i++)
		{
			totc+=sc.nextInt();
			c.push(totc);
		}
		int ans=0;
		while(true)
		{
			if(a.isEmpty()||b.isEmpty()||c.isEmpty())
			{
			break;
			}
			if(a.peek()==b.peek() && b.peek()==c.peek())
			{
				ans=a.peek();
				break;
			}
			else if(a.peek()>=b.peek() && a.peek()>=c.peek())
			{
				tota-=a.peek();
				a.pop();
			}
			else if(b.peek()>=a.peek() && b.peek()>=c.peek())
			{
				totb-=b.peek();
				b.pop();
			}
			else if(c.peek()>=a.peek() && c.peek()>=b.peek())
			{
				totc-=c.peek();
				c.pop();
			}
			
			
		}
		System.out.println(ans);
	
		
	}
	 


}
