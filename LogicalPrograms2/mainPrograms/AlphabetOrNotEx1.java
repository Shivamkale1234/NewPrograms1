package mainPrograms;

public class AlphabetOrNotEx1 {

	public static void main(String[] args) {
		
		char ch='G';
		
		if( ch >= 'a' && ch <= 'z' )  
        {
        	System.out.println(ch +" is not an Alphabet1");  
        }
		else if (ch >= 'A' || ch <= 'Z')
		{
			System.out.println(ch +" is an Alphabet"); 
		}
		else
		{
			System.out.println(ch +" is not an Alphabet"); 
		}

	}

}
