/*wap to student details and calculate annual salary*/
class Student
{
	public String name;
	public String stream;
	public static String college = "jntuh"; 
	public double percentage;
	public int sal;
	public String company;
	public int annualsalary()
	{
		return sal*12;
	}
	public void display()
	{
		System.out.println("****************************");
		System.out.println("name:"+name);
		System.out.println("stream:"+stream);
		System.out.println("college name:"+college);
		System.out.println("percentage is :"+percentage);
		System.out.println("salary is:"+sal);
		System.out.println("company name :"+company);
		System.out.println("anuualsalary is :"+annualsalary());
		System.out.println("****************************");

	}

	public static void main(String[] args) 
	{
		Student s1= new Student();
		Student s2= new Student();
		s1.name="Ganesh";
		s1.stream="ECE";
		s1.percentage=75.2;
		s1.sal=18000;
		s1.company="WIPRO";
		s2.name="sagar";
		s2.stream="MECH";
		s2.percentage=65.3;
		s2.sal=23000;
		s2.company="AMAZON";
		s1.display();
		s2.display();
	}
}
