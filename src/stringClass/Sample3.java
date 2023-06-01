package stringClass;

public class Sample3 {
	
	public static void main(String[] args) 
	{
		
//object creation of string without using new keyword  --> constant pool are
		String s1="abc";
		String s2="abc";
		String s3="abc1";
		
//object creation of string using new keyword --> non-constant pool area
		String s4=new String("abc");
		String s5=new String("abc");
		String s6=new String("abc1");
		
	}


}
