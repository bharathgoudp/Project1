interface  Sample
{
	public void ride();
}
	class Demo implements Sample
	{
	public void ride()
		{
		System.out.println("Ride fast...");
		}
	}
		class Mian
		{
	public static void main(String[] args) 
	{
		new Demo().ride();
	}
}
