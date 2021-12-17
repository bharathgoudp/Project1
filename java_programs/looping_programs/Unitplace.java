/*wap to print the number from its unit place*/
class Unitplace 
{
	public static void main(String[] args) 
	{
		int a=216516;
		int r;
		while(a>0)
		{
			r=a%10;
		System.out.println(r);
		a=a/10;
		}
	}
}
