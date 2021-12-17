class MNPrime
{
	public static void main(String[] args) 
	{
		int m=1;
		int n=100;
		for(int i=m;i<=n;i++)
		{
			int a=i;
		boolean isprime=true;
		for(int j=2;j<a;j++)
		{
			if(a%j==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime==true)
		{
			System.out.println(i+"is prime number");
		}

	}
}
}
