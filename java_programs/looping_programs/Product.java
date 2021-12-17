/*wap to print product of the number*/
class Product 
{
	public static void main(String[] args) 
	{
		int a=2165;
		int pro=1;
		int r;
	while(a>0)
		{
		r=a%10;
		pro=pro*r;
		a=a/10;
		}
		System.out.println(pro);
	}
}
