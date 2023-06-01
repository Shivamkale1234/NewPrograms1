package stringClass;

public class Sample1 {
	
	public static void main(String[] args)
	{
		//only declaration
		String s1;  
		 
		//declaration & initialization
		String s2="abcd";
		
		String s3="abc";
		System.out.println(s3);
		
		
		s3=s3+"xy";  //abcxy
		System.out.println(s3);
		
		
		s3=s3+"z";
		System.out.println(s3);
		
	}
}
