package mainPrograms;

public class PalindromeString 
{

	public static void main(String[] args) 
	{
		 String orgname = "appkppa";  
		 String rev ="";
		 	               
		 for(int i=orgname.length()-1; i>=0;  i--)
		 {
			 rev = rev+orgname.charAt(i);    
		 }
		 
		 if(orgname.equals(rev))
		 {
			 System.out.println(rev + ": given string is palindrome");
		 }
		 else
		 {
			 System.out.println(rev + ": given string is not an palindrome");
		 }
		 
	
	}

}
