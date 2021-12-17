class Celsius 
{
	public static double cell(int i)
	{
			return (i*9/5)+32;
	}
	public static double cell(double j)
	{
		double res = (j-32)*5/9;
		return res;
	}
	public static void main(String[] args) 
	{
     double d= cell(20);
	 double s = cell(30);
	 System.out.println(d);
	 System.out.println(s);
		System.out.println("Hello World!");
	}
}
