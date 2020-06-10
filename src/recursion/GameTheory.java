package recursion;

public class GameTheory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,5,9,3,400,3,6};
		System.out.println(GameTheory(arr,0,arr.length-1));

	}
	static int GameTheory(int[] arr,int l,int r)
	{
		if(l+1==r)
		{
			return Math.max(arr[l], arr[r]);
		}
		return Math.max(arr[l]+Math.min(GameTheory(arr,l+2,r),GameTheory(arr,l+1,r-1)),
				arr[r]+Math.min(GameTheory(arr,l,r-2),GameTheory(arr,l+1,r-1)));
	}

}
