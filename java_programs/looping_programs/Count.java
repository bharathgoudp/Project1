/*wap to count the numbers which are divisible by 5 and 7*/
class Count 
{
	public static void main(String[] args) 
	{
		int count=0;
		for(int i=0;i<=502;i++)
		{
			if(i%5==0&&i%7==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
