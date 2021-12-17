/*wap to check whether the given numbers is perfect  or not between m and n*/
class PerfectN/*perfect numbers betwwn m and n*/
{
	public static void main(String[] args) 
	{
	int m=1;
		int n=100;

		for(int i=m;i<=n;i++)
		{
			int a=i;
			int sum=0;
			for(int j=1;j<a;j++)
			{
			if(a%j==0)
			{
				sum=sum+j;
			}
		}
		if (sum==i)
		{
			System.out.println(i+"is a perfect number");

		}}
		/*else{
			System.out.println(n+"is not a perfect number");
		}*/
	}
}

