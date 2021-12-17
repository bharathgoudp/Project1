class Student
{
	public String name;
	public String stream;
	public static String college="jntuh";
	public double percentage;
	public String company;
	public int sal;
	Student(String name,String stream, double percentage,String company,int sal)
	{
		this.name=name;
		this.stream=stream;
		this.percentage=percentage;
		this.company=company;
		this.sal=sal;
	}
	public int annualSalary()
	{
		return sal*12;
	}
	public void display()
	{
				System.out.println("****************");

		System.out.println("name is:"+name);
		System.out.println("stream:"+stream);
		System.out.println("college name:"+college);
		System.out.println("percentage:"+percentage);
		System.out.println("company:"+company);
		System.out.println("salary:"+sal);
		System.out.println("annualsalary:"+annualSalary());
						System.out.println("****************");

	}
}
class StaticStudent
{

	public static void main(String[] args) 
	{
		Student s1 = new Student("ganesh","CSE",7.07,"WIPRO",18000);
		Student s2 = new Student("sagar","MECH",6.5,"AMAZON",23000);
		s1.display();
		s2.display();

	}
}
