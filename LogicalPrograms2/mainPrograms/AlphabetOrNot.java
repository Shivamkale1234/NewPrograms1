package mainPrograms;

public class AlphabetOrNot {

	public static void main(String[] args) {
		
		char temp = '1';
		
		if(temp>='A' && temp<='Z')
			
			System.out.print(temp+ " is the Capita alphabet");
			
		else if(temp>='a' && temp<='z')
		{
			System.out.print(temp+ " is the Small alphabet");
		}
		else
		{
			System.out.print(temp+ " is not an alphabet");
		}
		
	}

}
