class StrongNumber 
{
	public static void main(String[] args) 
	{
		int n=165;
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int fact=1;
			int rem=n%10;
			for(int i=1;i<=rem;i++)
			{
				fact*=i;
			}
			sum+=fact;
			n/=10;
		}
		if(sum==temp)
		{

		System.out.println("the number is a"+temp+"strong number");
		}
		else{
			System.out.println("the number  is a"+temp+"not a strong number");
		}
	}
}
