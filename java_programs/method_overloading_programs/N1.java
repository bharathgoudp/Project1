/*static variable rv to non static variable*/
class N1 
{
	public String s = "hai";
	public static void add()
	{
		N1 t1 = new N1();
			
	System.out.println(t1.s);

	}
	public static void main(String[] args) 
	{
	add();
	
	}
}
