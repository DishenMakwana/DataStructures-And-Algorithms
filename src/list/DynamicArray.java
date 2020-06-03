package list;

import java.util.*;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		ArrayList<Integer> ll1=new ArrayList<>();
		ArrayList<Integer> ll2=new ArrayList<>();
		for(int i=0;i<q;i++)
		{
			
		int type=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int last=0;
		
	
		if(type==1)
		{
			int	w = ((x^last)%n); 
			
			      if(w==0)
			      
			    	  ll1.add(y);
			      
	            else
	            	ll2.add(y);
		}
	        else{
	        	int	w = ((x^last)%n); 
	                if(w == 0)
	                       last = ll1.indexOf(y%ll1.size());
	                else
	                	last = ll2.indexOf(y%ll2.size());

	                System.out.println(last);
		          }
		
		}
	}

}
