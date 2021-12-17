class Mix11 
{
	public static void main(String[] args) 
	{
		int n=4;
		int k=0;
		for(int i=0;i<n;i++)
		{
			k=k+2*i+1;
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(k-- +" ");
				}
			}
		System.out.println( );
	}
	}
}
