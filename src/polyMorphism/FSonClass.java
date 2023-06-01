package polyMorphism;

public class FSonClass extends FatherClass {
	
		
	public void bike() 
	{
		System.out.println("bike: FZ V3");
	}

	public void car()   //override
	{
		System.out.println("Car: Kia");
	}

	public void money()    //override
	{
		System.out.println("money: 2L");
	}

}
