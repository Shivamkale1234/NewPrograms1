package StarPaternEx1to9;

public class StarPatternEx4 {
	
	public static void main(String[] args) {
		
        int i,j,row=5;
		
		for(i=1; i<=row; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=1; i<=4; i++)
		{
			for(j=4; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
