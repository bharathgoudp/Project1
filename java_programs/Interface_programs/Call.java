/*one clas can implements multiple interfaces*/
interface T
{
	void call();
}
interface Q
{
	void call();
}
class O implements T,Q
{
	public void call()
	{
		System.out.println("call to someone");
	}
}
class Call
{
	public static void main(String[] args) 
	{
	O o1=new O();
	o1.call();
	}
}
