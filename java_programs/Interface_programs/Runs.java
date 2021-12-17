interface Run
{
	/*by default static and final  variables are invisible in interface*/
public int k=100;
}
class Runs implements Run
{
	public static void main(String[] args) 
	{
		System.out.println(Run.k);
	}
}
