package StarPaternEx1to9;

public class StarPatternEx96 {
	
	public static void main(String[] args) {
		
		int i,j,n=5;
		
		for(i=1; i<=n; i++)
		{
			for(j=1; j<=n; j++)
			{
				if(j==1 || j==n)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
			
	}

}
