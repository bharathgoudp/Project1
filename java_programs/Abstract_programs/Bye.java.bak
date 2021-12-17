/*wap for hierarichal inheritance with abstract method*/
abstract class Hi 
{
	public static int a =100;
	abstract public void test();
	public void swim()
	{
		System.out.println("swim like a flish....");
	}
}
class B extends Hi
{
	public void test()
	{
		System.out.println("test to write");
		System.out.println(Hi.a);

	}
}
class C extends Hi
{
	public void test()
	{
		System.out.println("write the test...");
		System.out.println(Hi.a);
	}
}
class Bye
{
	public static void main(String[] args) 
	{
    B b1 = new B();
	C c1 = new C();
	b1.test();
	b1.swim();
	c1.test();
	c1.swim();

	}
}
