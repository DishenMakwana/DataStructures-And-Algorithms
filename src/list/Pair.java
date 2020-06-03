package list;

public class Pair<Datat1,Datat2> {
	Datat1 a;
	Datat2 b;
	public Pair(Datat1 a,Datat2 b)
	{
		this.a=a;
		this.b=b;
	}
	public void getDesc()
	{
		System.out.println(a+" "+b);
	}

}
