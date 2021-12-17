class Circle 
{
	public static double pi=3.14;
	public int r;
	Circle(int r)
	{
		this.r=r;
	}
	public double findCircumference()
	{
		return 2*pi*r;
	}
	public void display()
	{
				System.out.println("pi:"+pi);
					System.out.println("radius:"+r);
					System.out.println("circumference is :"+findCircumference());
							

	}
}
class staticcircle
{
	public static void main(String[] args) 
	{
		Circle c1 =new Circle(6);
c1.display();


	}
}
