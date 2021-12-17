/*non static method  directly to non static variable*/
class NSM 
{
		public int a =100;

	public void add()
	{
				System.out.println(a);
	}

				public static void main(String[] args) 
	{
		System.out.println("exe starts.....");
		NSM n1 = new NSM();
		n1.add();


	}
}
