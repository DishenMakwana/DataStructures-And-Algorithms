package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DownToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int que=sc.nextInt();
		for(int i=0;i<que;i++)
		{
			int n=sc.nextInt();
			if(prime(n)) {
				System.out.println(n);
				continue;
			}
			else {
			//Queue<Integer> q1=new LinkedList<>();
			int count=0;
			int temp=n;
			for(int j=2;j<temp;j++)
			{
				if(temp%j==0)
				{
					count++;
					int a=j;
					int b=temp/j;
					int max=Math.min(a, b);
					if(prime(max))
					{
						count=count+max;
						break;
					}
					else
					{
						j=1;
						temp=max;
					}
				}
				
			}
			System.out.println(count);
			}
			
			
		}

	}
	public static  boolean  prime(int n)
	{
		int temp=n;
		int count=0;
		boolean tr=true;
		for(int i=2;i<temp;i++)
		{
			if(temp%i==0)
			{
				count++;
				tr=false;
				break;
			}
		}
		return tr;
		
	}

}
