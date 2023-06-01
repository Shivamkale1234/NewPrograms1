package mainPrograms;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String name = "sdfghjk";
		
		int n = name.length();
		
		for(int i=n-1; i>=0; i--)
		{
			char b = name.charAt(i);
			System.out.print(b);
		}
	}

}
