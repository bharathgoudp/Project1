/*accsessing memebers of class in another class*/
class One 
{
	public static char a = '#';
	public int b = 100;
}
/*create file name as class name which contains main method*/
class Two
{

	public static void main(String[] args) 
	{
		System.out.println(Onea);
		One a1 = new One();
		System.out.println(a1.b);
	}
}
