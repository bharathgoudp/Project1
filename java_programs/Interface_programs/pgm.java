/*pgm for interface can inherit(extends) from another interface */
interface Sample 
{
	void move();
}
	interface Demo extends Sample
	{
		 void walk();
	}
		/*interface Main extends Demo
		{

          public void move();
			  public void walk();
		}*/
		  class Main1 implements Demo
		  {
			   public void move()
			  {
				  System.out.println("hi");
			  }
			  public void walk()
			  {
				  System.out.println("bb");
			  }
		  }
		  class pgm
		  {
	public static void main(String[] args) 
	{
		Main1 m1=new Main1();
		m1.move();
		m1.walk();
		
	}
}
