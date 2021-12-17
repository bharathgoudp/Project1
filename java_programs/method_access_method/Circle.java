class Circle 
{
	public static double pi=3.14;
	public  double r = 5.5;
	public double findCircumference()
	{
		return 2*pi*r;
	}
	
	public static void main(String[] args) 
	{
		Circle c1 = new Circle();
		c1.circumference();
		System.out.println(c1.findCircumference());
		System.out.println("Hello World!");
	}
}
