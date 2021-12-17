class PrimePos 
{
	public static void main(String[] args) 
	{
		int pos=2 ;
		int count=0;
		for(int i=1;i<=i+1;i++)
		{
			int a=i;
			boolean isprime=true;
			for(int j=2;i<a;j++)
			{
				if(a%j==0)
				{
					isprime=false;
				}
			}
			if(isprime==true)
			{
              count++;
			}
			if(pos==count)
			{

		System.out.println("the number"+i+"is present at position"+pos);
break;
	}
}
	}
}
