/*wap to find summation of number*/
class Summation 
{
	public static void main(String[] args) 
	{
		int n=356;
		int sum=0;
		int r;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
             n=n/10;
		}

		System.out.println("the summation of"+temp+" "+"is:"+" "+sum);
	}
}
