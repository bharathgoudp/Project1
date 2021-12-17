/*create 1 static and 1 non static method*/
class Non 
{
	public static void fight()
	{
		System.out.println("Fight to win...");
	}
	public void eat()
	{
		System.out.println("eat for energy");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		fight();
		Non obj = new Non();
		obj.eat();
		System.out.println("main ends....");
	}
}
