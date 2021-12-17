class MNArmstrong 
{
	public static void main(String[] args) 
	{
		int m=1;
		int n=250;
		for(int i=m;i<=n;i++)
		{
			int count=0;
			int sum=0;
			int temp=i;
			int check=i;
			int r=i;
			while(temp>0)
			{
				count++;
				temp/=10;
			}
			while(check>0)
			{
				int prod=1;
				for(int j=1;j<=count;j++)
				{
					prod*=check%10;
				}
				sum=sum+prod;
				check=check/10;
			}
			if(sum==r)
			{

		System.out.println(r+"is armstrong number ");
	}
}
	}
}