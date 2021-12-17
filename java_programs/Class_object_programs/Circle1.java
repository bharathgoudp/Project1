class Circle1 
{
	public static double pi = 3.14;
	public double r;
	public void findCircumference()
	{
		System.out.println(2*pi*r);
	}

	public static void main(String[] args) 
	{
		Circle1 c1 = new Circle1();
		Circle1 c2 = new Circle1();
		Circle1 c3 = new Circle1();
		c1.r = 3.5;
		c2.r = 5.2;
		c3.r = 4.5;
        c1.findCircumference();
        c2.findCircumference();
        c3.findCircumference();
	}
}
