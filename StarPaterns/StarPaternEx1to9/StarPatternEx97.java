package StarPaternEx1to9;

public class StarPatternEx97 {

	public static void main(String[] args) {
		
		 		 
		 int i,j,n=5;
			
			for(i=1; i<=n; i++)
			{
				for(j=1; j<=n; j++)
				{
					if(i==n/2+1||j==n/2+1)
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
