/*static method access non static method through refernce variable*/
class Sm

{
	public static void move()
	{
		System.out.println("move like no one else");
				Sm s1 = new Sm();
		s1.move1();


	}
	public void move1()
	{
		System.out.println("race to win" );
	}

	public static void main(String[] args) 
	{
		move();
		System.out.println("Hello World!");
	}
}
