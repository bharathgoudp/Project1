class MNStrong 
{
	public static void main(String[] args) 
	{
		int m=1;
		int n=200;
		for(int i=m;i<=n;i++)
		{
			int g=i;
			int sum=0;
			int temp=i;
			while(g>0)
			{
				int fact=1;
				for(int j=1;j<=g%10;j++)
				{
					fact*=j;
				}
				sum+=fact;
				g/=10;
			}
			if(sum==temp)
			{
		System.out.println(temp+"is a strong number ");
	}
}
	}
}
