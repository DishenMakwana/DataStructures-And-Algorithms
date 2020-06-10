package recursion;

public class FillColorProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,0,2,2},
					{3,3,0,2,2},
					{0,0,0,0,1},
					{3,1,2,1,1}};
		FillColor(a,2,2,9,0);
		printMatrix(a);

	}
	
	static void printMatrix(int a[][]) {
		for(int[] array: a) {
			for(int element: array) {
				System.out.print(element +" ");
			}
			System.out.println();
		}
	}
	static void FillColor(int[][] a,int r,int c,int fill,int prev)
	{
		int row=a.length;
		int col=a[0].length;
		if(r>=row || c>=col ||r<0 ||c<0)
		{
			return;
		}
		if(a[r][c]!=prev)
		{
			return;
		}
		a[r][c]=fill;
		FillColor(a,r+1,c,fill,prev);
		FillColor(a,r-1,c,fill,prev);
		FillColor(a,r,c+1,fill,prev);
		FillColor(a,r,c-1,fill,prev);
	
	}

}
