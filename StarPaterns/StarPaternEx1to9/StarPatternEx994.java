package StarPaternEx1to9;

public class StarPatternEx994 {
	
public static void main(String[] args) {
		
	 int i,j,n=5;
		
		for(i=1; i<=n; i++)
		{
			for(j=5; j>=i; j--)
			{
				
				if(i==1||j==i||j==n)
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
}  }
