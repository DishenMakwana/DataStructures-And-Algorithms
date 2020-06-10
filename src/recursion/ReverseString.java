package recursion;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		reversStr(str);

	}
     
	static void reversStr(String str)
	{
		if(str.length()<=1 || str==null)
		{
			System.out.println(str);
		}
		else
		{
			System.out.print(str.charAt(str.length()-1));
			reversStr(str.substring(0, str.length()-1));
		}
	}
}
