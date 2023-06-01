package StarPaternEx1to9;

public class StarPatternEx990 {

	public static void main(String[] args) {
		
		int i,j,n=5;
		
		for(i=1; i<=n; i++)
		{
			for(j=1; j<=n; j++)
			{
				if(i==j)
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
