

class Assign9 
{
	public static void main(String[] args) 
	{
		int n=5;
	for(int i=0;i<n;i++)
		{
		int k=1;
	char ch='a';
		for(int j=0;j<n;j++)
			{
			    if(i==n/2)
				{
					System.out.print("+ ");
				}
				else if (j==n/2)
				{
					System.out.print("+ ");
				}
			    else if(i==0||i==n-1)
				{
				System.out.print(k++ +" ");
				}
				else
					System.out.print(ch++ +" ");
			}
		System.out.println();
	}
}
}