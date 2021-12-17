/*non static method directly access to non static method*/
class NonStaticMethod 
{
	public void add()
	{
		System.out.println("hy");
	}
	public void add1()
	{	
		System.out.println("bye");
		add();
	}

	public static void main(String[] args) 
	{
		NonStaticMethod n1 = new NonStaticMethod();
		n1.add1();

	}
}
