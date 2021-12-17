class Mix12 
{
	public static void main(String[] args) 
	{
		int n=4;
		char ch='A';
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n ;j++ )
			{
				if(i>=j)
				{
					ch++;
				}
			}
			char l=(char)(ch-1);
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(l-- +" ");
				}
			}
		System.out.println( );
	}
	}
}
