package stringClass;

public class Sample5 {
	
	public static void main(String[] args) 
	{
		String s1="my name is abc";
		String[] ar = s1.split(" ");    // {my(0)     name(1)      is(2)      abc(3) }
		
		System.out.println(ar.length);   //4
		System.out.println(ar[1]);       //name
		
		System.out.println("-------");
		
		for(int i=0; i<=3; i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
