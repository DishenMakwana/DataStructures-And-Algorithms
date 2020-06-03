package Stack;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
	public static void main (String[] args) {
		//code
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		String[] str=new String[n];
		
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
			Stack<Character> ss=new Stack<>();
			boolean tr=true;
			for(int j=0;j<str[i].length();j++)
			{
				if(str[i]==null)
				{
					System.out.println("YES");
					System.exit(0);
				}
				else if(str[i].charAt(j)=='['||str[i].charAt(j)=='{'||str[i].charAt(j)=='(' )
				{
					ss.push(str[i].charAt(j));
					//System.out.println(ss);
					continue;
				}
				else if(str[i].charAt(j)==')')
				{
					if(ss.peek()=='(')
					{
						ss.pop();
						continue;
					}
					else {
					
						tr=false;
						break;
					}
				}
				else if(str[i].charAt(j)=='}')
				{
					if(ss.peek()=='{')
					{
						ss.pop();
						continue;
					}
					else {
					
						tr=false;
						break;
					}
				}
				else 
				{
					if(ss.peek()=='[')
					{
						ss.pop();
						continue;
					}
					else {
					
						tr=false;
						break;
					}
				}
				
				
			}
			System.out.println(ss);
			if(ss.isEmpty())
			{
				System.out.println("YES");
				
			}
			else if(tr){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
			
		}
		
		
	}
}