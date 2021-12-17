/*copies of members*/
class Rub 
{
	public static int a = 87;
	public int b = 99;
	public static void main(String[] args) 
	{
		System.out.println("exe startts.....");

		System.out.println(a);
		Rub r1 = new Rub();
		Rub r2 = new Rub();
		Rub r3 = new Rub();
		System.out.println(r1.b);
		System.out.println(r2.b);
				System.out.println(r3.b);


}
}