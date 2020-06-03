package Stack;

import java.util.Scanner;
import java.util.Stack;

public class GameOfTwoStackes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int g=sc.nextInt();
		while(g--!=0)
		{
			int x=sc.nextInt();
			int[] a=new int[x];
			for(int i=0;i<x;i++)
			{
				a[i]=sc.nextInt();
			}
			int y=sc.nextInt();
			int[] b=new int[y];
			
			for(int i=0;i<y;i++)
			{
				b[i]=sc.nextInt();
			}
			int k=sc.nextInt();
			
			Stack<Integer> s1=new Stack<>();
			Stack<Integer> s2=new Stack<>();
			
			for(int i=x-1;i>=0;i--)
			{
				s1.push(a[i]);
			}
			
			for(int i=y-1;i>=0;i--)
			{
				s2.push(b[i]);
			}
			System.out.println(s1);
			System.out.println(s2);
			int sum=0;
			int count=0;
			while(sum<=k)
			{
				int p1=0;
				int p2=0;
			
				if(!(s1.isEmpty()))
				{
					p1=s1.peek();
					if(!(s2.isEmpty()))
					{
						p2=s2.peek();
						if(p1>=p2)
						{
							int pp=s2.peek();
							sum+=pp;
							s2.pop();
							count++;
							continue;
						}
						else
						{
							int pp=s1.peek();
							sum+=pp;
							s1.pop();
							count++;
							continue;
						}
					}
					else
					{
						int pp=s1.peek();
						sum+=pp;
						s1.pop();
						count++;
						continue;
					}	
				}
				else
				{
					int pp=s2.peek();
					sum+=pp;
					s2.pop();
					count++;
					continue;
					
				}
			}
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(count);
			
		}
	}

}
