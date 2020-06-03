package Stack;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String s="";
		Stack<String> str=new Stack<>();
		
		
		
		str.push(s);
		while(t--!=0)
		{
			int n=sc.nextInt();
			if(n==1)
			{
				String str1=sc.next();
				s=s+str1;
				str.push(s);
				continue;
						
			}
			else if(n==2)
			{
				int k=sc.nextInt();
				s=s.substring(0, s.length()-k);
				str.push(s);
				continue;
				
			}
			else if(n==3)
			{
				int k=sc.nextInt();
				System.out.println(s.charAt(k-1));
				continue;
			}
			else
			{
				str.pop();
				s=str.peek();
				continue;
			}
			
		}

	}

}
