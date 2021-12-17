/*wap for multilevel inheritance , define two abstract methods in super class ,
over ride first method in the immediate sub class and second method in the next sub class*/


abstract class S 
{
	abstract public void fight();
	abstract public void act();
}
  abstract class P extends S
{
	public void fight()
	{
		System.out.println("fight to finish");
	}
	
	
}
class Q extends P
{
 public void act()
	{
	 System.out.println("act like hero");
	}
}
class Multi
{
	public static void main(String[] args) 
	{
		Q q1 = new Q();
		q1.fight();
		q1.act();
		System.out.println("Hello World!");
	}
}
