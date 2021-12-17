/*wap for generalization & specialization for below requirements
flower,rose,lilly,jasmine,garden1,garden2,main class*/
class Flower 
{
	public void view()
	{
		System.out.println("view a flower");
	}
}
class Rose extends Flower 

{
	public void colour()
	{
		System.out.println("red colour");
	}
}
class Lilly extends Flower
{
	public void smell()
	{
		System.out.println("smells good");
	}
}
class Jasmine extends Flower
{
	public void look()
	{
		System.out.println("looks good");
	}
}
class Garden1
{
	public static void design(Rose r1)
	{
		r1.view();
		r1.colour();
	}
	public static void display(Lilly l1)
	{
		l1.view();
		l1.smell();
	}
	public static void print(Jasmine j1)
	{
		j1.view();
		j1.look();
	}
}
class Garden2
{
	public static void info(Flower f1)
	{
		f1.view();
	}
}
class Assign
{
	public static void main(String[] args) 
	{
		System.out.println("specialization starts...");
		Garden1.design(new Rose());	
		Garden1.display(new Lilly());
		Garden1.print(new Jasmine());
		System.out.println("generalization starts........");
		Garden2.info(new Rose());
		Garden2.info(new Lilly());
		Garden2.info(new Jasmine());
		System.out.println("Hello World!");
	}
}
