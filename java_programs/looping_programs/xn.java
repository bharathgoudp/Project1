/*wap to find xn*/
class xn 
{
	public static void main(String[] args) 
	{
		int x=2;
		int n=3;
		int pro=1;
		for(int i=1;i<=n;i++)
		{
			pro*=x;
		}
		System.out.println("the"+x+"power"+" " +n+ "is:"+pro);
	}
}
