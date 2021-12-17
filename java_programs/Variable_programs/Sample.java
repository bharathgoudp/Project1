class Sample 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts....");
		/*below variable b is loacl to main method*/
		int b=85;
		System.out.println(b);
		demoVariable();
		System.out.println("main ends...");
	}
	public static void demoVariable()
	{
		System.out.println("test starts...");
		/*below variable g is local to demoVariable*/
		double g = 2.5;
		System.out.println(g);
		System.out.println("test ends....");
}
}