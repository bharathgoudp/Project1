class Assign6 
{
	public static void main(String[] args) 
	{
		int n=4;
		int k=1;
		char ch='z';
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j%2==0)
				{
				System.out.print(k++ +" ");
				}
				else
					System.out.print(ch-- +" ");
			}
		System.out.println( );
	}
	}
}
