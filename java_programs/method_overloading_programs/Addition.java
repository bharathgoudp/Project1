class Addition

{
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void add(int a, double b)
	{
				System.out.println(a+b);
						System.out.println(");

	}
	public static void add(double a, int b)
	{
				System.out.println(a+b);
	}
	public static void add(int a, double b,double c)
	{
				System.out.println(a+b+c);

	}
	public void add(int a)
	{
				System.out.println(a);
	}

	public static void main(String[] args) 
	{
		System.out.println("starts....");
		add(5,4);
		add(5,4.5,5.5);
		add(5,5.5);
		add(5.5,6);
		Addition obj = new Addition();
		obj.add(6);
				System.out.println("ends....");

	}
}
