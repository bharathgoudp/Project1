class Str9 
{
	public static void main(String[] args) 
	{
		int k=1;
		char ch='a';
		int n=4;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j%2==0)
				{
					System.out.print(k++ +" ");
				}
				else
					System.out.print(ch++ +" ");
			}
		System.out.println( );
	}}
}
