/*wap of one static and one non static of same datatype */
class Static 
{
	public static int a = 55;
	public int b = 26;
	public static void main(String[] args) 
	{
		System.out.println(a);
		Static obj = new Static();
		System.out.println(obj.b);
	}
}
