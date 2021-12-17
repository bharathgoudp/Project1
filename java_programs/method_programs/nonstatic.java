class nonstatic
{
public void swim()
	
{
	System.out.println("Swim across the river..");
}
	public static void main(String[] args) 
	{
		System.out.println("Execution starts...");
		nonstatic obj = new nonstatic();
		obj.swim();
				System.out.println("Execution ends...");

	}
}
