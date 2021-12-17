/*WAP FOR THE BELOW REQUIREMENTS
1:CREATE FOUR CLASSES 
2:FIRST CLASS WILL CONTAIN STATIC AND NON STATIC VARIABLE , SECOND CLASS CONTAINS STATIC AND NON STATIC METHOD , 3RD CLASS ONTAINS STATIC VARIABLE NON STATIC VARIBLE STATIC METHOD NON STATIC METHOD ,4TH CLASS CONTAINS MAIN METHOD
3:FIRST CLASS STATIC VARIABLE IS PRINTED IN SECOND CLASS STATIC METHOD 
4:FIRST CLASS NON STATIC VARIABLE IS PRINTED IN SECOND CLASS NON STATIC METHOD 
5:SECOND CLASS STATIC METHOD IS CALLED IN THIRD CLASS STATIC METHOD 
6:SECOND CLASS NON STATIC METHOD IS CALLED IN THIRD CALSS NON STATIC METHOD
7:THIRD CLASS STATIC VARIABLE IS PRINTED IN SAME CLASS STATIC METHOD
8:THIRD CLASS NON STATIC VARIABLE IS PRINTNED IN SAME CLASS NON STATIC METHOD
9:THIRD CLASS STATIC METHOD IS CALLED IN SAME CLASS NON STATIC METHOD
10:THIRD CLASS NON STATIC METHOD IS CALLED FROM MAIN METHOD OF 4TH CLASS*/

class A
{
public static  int a = 55;
public double b = 0.5;
}  
class B
{
public static void add()
	{
	System.out.println(A.a);
	}
	public void add1()
	{
		A a1 = new A();
		System.out.println(a1.b);
	}
}
class C
{

public static char c = '*';
public String s = "hi";
public static void man()
	{
		System.out.println("2nd class static method is called");
		B.add();
          System.out.println(c);

	}
	public void man1()
	{
			System.out.println("2nd class non static method is called");
         B b1 = new B();
            b1.add1();
			System.out.println(s);
			man();
	}
}
class D

{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.man1();
		System.out.println("end");
	}
}
