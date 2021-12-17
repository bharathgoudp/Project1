/*static method directly access to static method*/
class  Static
{
	public static void add()
	{
		System.out.println("hi");
	}
		public static void add1()
	{
		
			System.out.println("bye");
			add();
	}

	public static void main(String[] args) 
	{
	add1();
		
	}
}
