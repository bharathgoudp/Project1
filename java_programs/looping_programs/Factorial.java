/*wap to print factorial of a number*/
class Factorial 
{
	public static void main(String[] args) 
	{
		int n=3;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println("the factorial of "+n+"is:"+fact);
	}
}
