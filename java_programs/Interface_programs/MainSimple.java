/*single interface can imolements multiple classes*/
interface Animal
{
	void makeSound();
}
class Lion implements Animal
{
	public void makeSound()
	{
		System.out.println("lion roars...");
	}
}
class Dog implements Animal
{
	public void makeSound()
	{
		System.out.println("Dog barks...");
	}
}
class Cat implements Animal
{
	public void makeSound()
	{
		System.out.println("meow....");
	}
}
class MainSimple 
{
	public static void main(String[] args) 
	{
		new Cat().makeSound();
		new Dog().makeSound();
		new Lion().makeSound();
		System.out.println("Hello World!");
	}
}
