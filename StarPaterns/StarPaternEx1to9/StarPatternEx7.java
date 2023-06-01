package StarPaternEx1to9;

public class StarPatternEx7 {
	
	public static void main(String[] args) {
		
		int i,j,k,row=5;
		
		for(i=1; i<=row; i++)
		{
				for(j=4; j>=i; j--)
				{
					System.out.print(" ");
				}
				for(k=1; k<=i; k++)
				{
					System.out.print("*");
				}
				System.out.println();
		}
		for(i=1; i<=row; i++)
		{
			    for(j=1; j<=i; j++)
			    {
					System.out.print(" ");
				}
				for(k=4; k>=i; k--)
				{
					System.out.print("*");
				}
				System.out.println();
		}
			
	}

}
