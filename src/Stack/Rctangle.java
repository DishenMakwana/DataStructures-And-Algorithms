package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Rctangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a= {8979 ,4570 ,6436 ,5083, 7780, 3269, 5400, 7579, 2324, 2116};
//		Arrays.parallelSort(a);
//		for(int e:a)
//		{
//			System.out.println(e);
//		}
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		Stack<Integer> s=new Stack<>();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int el=a[i];
			int countf=0;
			int countb=0;
			int totcount=0;
			for(int j=i+1;j<n;j++)
			{
				if(el<=a[j])
				{
					countf++;
				}
				else
				{
					break;
				}
			}
			for(int j=i-1;j>=0;j--)
			{
				if(el<=a[j])
				{
					countb++;
				}
				else
				{
					break;
				}
				
			}
			totcount=1+countf+countb;
			if(s.isEmpty())
			{
				s.push(a[i]*totcount);
			}
			else
			{
				if(s.peek()<(a[i]*totcount))
				{
					s.pop();
					s.push(a[i]*totcount);
				}
			}
			
			
		}
		int Max=s.peek();
		System.out.println(Max);

	}

}
