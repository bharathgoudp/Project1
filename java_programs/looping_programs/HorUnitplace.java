/*wap to print the number from its unit place in horizontal*/
class HorUnitplace 
{
	public static void main(String[] args) 
	{
		int a=216516;
		int r;
		while(a>0)
		{
			r=a%10;
		System.out.print(r);
		a=a/10;
		}
		System.out.println();
	}
}