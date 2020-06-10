package recursion;

import java.util.Scanner;

public class PalindromUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		boolean check=checkpalindrom(str,0,str.length()-1);
		if(check)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}

	}
	static boolean checkpalindrom(String str,int s,int e)
	{
		if(s==e)
		{
			return true;
		}
		else if(str.charAt(s)!=str.charAt(e))
		{
			return false;
		}
		if(s<e+1)
		{
			return checkpalindrom(str,s+1,e-1);
		}
		return true;
	}

}
