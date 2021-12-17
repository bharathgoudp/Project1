abstract class E 
{
	public void jump()
	{
		System.out.println("jump high.....");
	}
	abstract public void fly();
}
class F extends E
{
public void fly()
	{
	System.out.println("fly high....");
	}
}
class FE

{
	public static void main(String [] args)
	{
		F f1=new F();
	f1.fly();
	f1.jump();

}
}