class Requirements 
{
	/*4.1*/
	public static int a = 100;
	public int b = 200;
	/*4.3,4.4*/
		public static int c = 300;
	public double d = 2.5;
	/*4.2*/
		public static void move()

	{
		int f = 100;
		System.out.println(f);
	}
	/*4.2*/
	public void run()
	{
		System.out.println("Fly far away...");
	}
	public static void main(String[] args) 
	{
		/*4.5*/

		System.out.println("main starts...");
		System.out.println(a);
		Requirements obj = new Requirements();
		System.out.println(obj.b);
		System.out.println(obj.d);
		//System.out.println(obj.run);
		obj.run();

		move();
		System.out.println("main ends....");


	}
}
