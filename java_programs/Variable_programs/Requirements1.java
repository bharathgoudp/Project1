class Requirements1 
{
	public static double m = 5.5;
	public double n = 9.9;
	public static void test()
	{
		boolean a = true;
		System.out.println(a);
	}
	public void test1()
	{
		String b = "hi";
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		test();
		Requirements1 obj = new Requirements1();
		obj.test1();
		System.out.println(m);
		System.out.println(obj.n);
	}
}
