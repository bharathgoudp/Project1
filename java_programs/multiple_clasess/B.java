/* Access one class file into antoher file with in the same foldser */
class B 
{
	/* execution done in main program file */

	public static void main(String[] args) 
	{
		System.out.println(A.a);
		A a1 = new A();
		System.out.println(a1.b);
	}
}
