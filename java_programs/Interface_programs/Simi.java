/*single class can implement multiple interfaces*/
interface G
{
	void act();
}
interface H
{
	void ride();
}
interface I
{
	void fly();

}
class J implements G,H,I
{
	public void act()
	{
		System.out.println("act like a hero");
	}
	public void ride()
	{
		System.out.println("ride a car");
	}
	public void fly()
	{
		System.out.println("fly like a bird");
	}
}
class Simi 
{
	public static void main(String[] args) 
	{
		J j1 = new J();
		j1.act();
		j1.ride();
		j1.fly();
	}
}
