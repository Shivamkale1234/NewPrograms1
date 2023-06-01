package stringClass;

public class Sample4 {
	
	public static void main(String[] args) 
	{
//		String s7="hi hello 27th may 2023";
//		System.out.println(s7.contains("28th may 2023"));
		
		String s1="velocity";
		String s2="ABCD";
		String s3="abcd";
		String s4="my name is abc";
		String s5="abcabcab";
		
		
		s3=s3.substring(0,1).toUpperCase() + s3.substring(1);
		System.out.println(s3);
		
		System.out.println(s1.substring(4,6));  //4-5  ci
		System.out.println(s1.substring(4));   //city
		
		System.out.println("------");
		
		System.out.println(s5.lastIndexOf('a'));   //6
		System.out.println(s5.indexOf('b'));  //1
		System.out.println(s1.charAt(3));   //o
		System.out.println(s2.concat(s3));   //ABCDabcd
		System.out.println(s2+s3);    //ABCDabcd		
		System.out.println(s4.replace("abc", "rahul"));   //my name is rahul
		
		System.out.println("---------------------");
		
		System.out.println(s1.length());   //8
		System.out.println(s1.isEmpty());   //false
		
//		s1=s1.toUpperCase();
//		System.out.println(s1);
		System.out.println(s1.toUpperCase());     //VELOCITY
		
//		s2=s2.toLowerCase();
//		System.out.println(s2);
		System.out.println(s2.toLowerCase());   //abcd
		
		System.out.println("------------------");
		
		System.out.println(s2.equals(s3));   			// false
		System.out.println(s2.equalsIgnoreCase(s3));    //true
		System.out.println(s4.contains("abc"));     //true
		
		System.out.println("---");
		
		System.out.println(s4.startsWith("my"));    //true
		System.out.println(s4.endsWith("bc"));   //true
				
	}

}
