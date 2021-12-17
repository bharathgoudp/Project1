class PerfectSquareMN 
{
	public static void main(String[] args) 
	{
		int m=1;
		int n=100;
		for(int i=m;i<=n;i++)
		{
			int a=i;
			boolean ischeck=false;
			for(int j=1;j<=a;j++)
			{
				if(j*j==a)
				{
					ischeck=true;
					break;
				}
			}
			if(ischeck==true)
			{
		System.out.println(a+"is a perfect square number!");
	}
}
	}
}

