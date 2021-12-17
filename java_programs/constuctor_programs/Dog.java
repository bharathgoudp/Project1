class Dog
{
	public String name;
	Dog(String s)
	{
	name = s; 
	}
	public void display()
	{
		System.out.println("dog name is:"+name);
	}

	public static void main(String[] args) 
	{
		Dog r1 = new Dog("puppy");
		Dog r2 = new Dog("Tommy");
		r1.display();
		r2.display();
	}
}
