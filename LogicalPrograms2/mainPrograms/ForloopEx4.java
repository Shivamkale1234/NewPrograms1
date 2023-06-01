package mainPrograms;

public class ForloopEx4 {
	
	public static void main(String[] args) 
	{
		int num=20;
		int c=0; 

		for(int z=1; z<=num; ++z)
		{
			if(z%1==0)	
			{                     
			    System.out.print(z+" ");
			    c++;
		    }	
		}
		System.out.print("total number count is " + c);
	}
}
