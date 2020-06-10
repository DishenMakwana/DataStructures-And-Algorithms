package recursion;

import java.util.HashSet;

public class AllPossibleString {
		static HashSet<String> st=new HashSet<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Str("abcc",0,2);

	}
	static void Str(String s,int l,int r)
	{
		if(l==r)
		{
			if(st.contains(s))
			{
				return;
			}
			System.out.println(s);
			return;
		}
		for(int i=l;i<=r;i++)
		{
			s=fixf(s,i,l);
			Str(s,l+1,r);
			s=fixf(s,i,l);
		}
	}
static String fixf(String s,int i,int l)
{
	char[] ch=s.toCharArray();
	char temp=ch[l];
	ch[l]=ch[i];
	ch[i]=temp;
	return String.valueOf(ch);
}
}
