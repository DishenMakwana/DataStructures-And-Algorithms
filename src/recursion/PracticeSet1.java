package recursion;

public class Set1 {

	public static void main(String[] args) {
	System.out.println(sum(10));
	System.out.println(fastPow(3,4));
	System.out.println((grid(10,2)));

	}
	static int sum(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return sum(n-1)+n;
	}
	static  int fastPow(int a,int b)
	{
		if(b==0)
		{
			return 1;
		}
		else if(b%2==0)
		{
			return fastPow(a*a,(b/2));
		}
		return a*fastPow(a,b-1);
		
	}
static int grid(int n,int m)
{
	if(n==1 || m==1)return 1;
	return grid(n,m-1)+grid(n-1,m);
}
}
