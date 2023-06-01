package mainPrograms;

public class Evenodd_If_ElseEx2 {
	
	public static void main(String args[])
	{
		int num = 100;
		int c = 0;
		
		for(int i=0; i<=num; i++)
		{
			if(i%5==0)
			{
				System.out.print(i + ", ");
				c++;
			}
		}
		System.out.println(c); 
	}
}



























