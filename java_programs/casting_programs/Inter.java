/*wap for interface with method ,create an implementation class , perform upcasting and call the method*/
interface A
{
	void act();
}
class B implements A
{
	public void act()
	{
		System.out.println("act like a herooo............");
	}
	public void read()
	{
		System.out.println("read a book.....");
	}
}
class Inter
{
	public static void main(String[] args) 
	{  
		A a1= new B();
		a1.act();

	}
}
/*upcasting is not onlly done between super class and sub class we can perform upcasting in interface and implementation class also*/
