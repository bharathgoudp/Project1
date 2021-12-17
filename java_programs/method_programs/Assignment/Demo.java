/*wap for one static and non static and call to main method*/
class Demo 
{
	public static void swim()
	{
		System.out.println("Swim 5km....");
	}
	public static void main(String[] args) 
	{
		System.out.println("Execution starts....");
						Demo obj = new Demo();

		obj.play();
		swim();
		System.out.println("Execution ends...");
	}
	public void play()
	{

		System.out.println("Play like a king....!");
	}
}
