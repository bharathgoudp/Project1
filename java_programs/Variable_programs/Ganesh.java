/*wap to create one static and one non static variable both the variables are of different datatypes print in main method*/
class Ganesh
{
	public static int a = 99;
		public double b = 1.02;
	public static void main(String[] args) 
	{
		System.out.println("Execution starts.....");
		System.out.println(a);
			Ganesh obj = new Ganesh();
		System.out.println(obj.b);
		System.out.println("Execution ends....");
	}
}
