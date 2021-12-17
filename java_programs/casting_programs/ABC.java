/*wap for hierarichal inheritance using upcasting and down casting*/ 
class A 
{
	public void sleep()
	{
		System.out.println("sleep");
	}
}
class B extends A
{
	public void eat()
	{
		System.out.println("eat");
}
}
class C extends A
{
	public void act()
	{
		System.out.println("act");
	}
}
class ABC
{

	public static void main(String[] args) 
	{
		A a1= (A) new B();
		a1.sleep();
		B b1 = (B) a1;
		b1.sleep();
		b1.eat();
		A a2 =(A) new C();
		a2.sleep();
		C c1 = (C) a2;
		c1.sleep();
		c1.act();
	}
}
