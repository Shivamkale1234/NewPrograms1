package controllStatement;

public class Example4_nested_if_else {

	public static void main(String[] args) {
		 
		int prelim = 350;
		int main   = 800;
		
		if(prelim>=300)
		{
			System.out.println("prelim exam pass");
			
			if(main>=800)
			{
				System.out.println("main exam pass");
			}
			else
			{
				System.out.println("main exam fail");
			}
		}
		else
		{
			System.out.println("prelim exam fail");
		}

	}

}
