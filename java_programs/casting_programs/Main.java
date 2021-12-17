
/*wap for single level inheritance , method overriding,upcasing and then call the method*/
class Single 
{
	public void test()
	{
		System.out.println("test a program");
	}
}
class In extends Single
{
	public void test()
	{
		System.out.println("test a bike");
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Single s1 = new In();
		s1.test();
	}
}
/*after method overriding even we perfrorm  upcasting also we will get the overriden ouput bcoz the methoid is overridden*/
