package Oops;

public class Method_overloading
{
	//Method for adding two integers
	public int add(int a,int b)
	{
		return a+b;
	}
	
	//Method for adding 3 integers			METHOD OVERLOADING
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	//Method for adding two doubles
	public double add(double a,double b)
	{
		return a+b;
	}
	
	//Method for concatenating two strings
	public String add(String s1, String s2)
	{
		return s1+s2;
	}
	
	public static void main(String[] args)
	{
		Method_overloading m=new Method_overloading();
		System.out.println(m.add(2,3));
		System.out.println(m.add("Ashutosh", "singh"));
		System.out.println(	m.add(2.0,3.0));
		System.out.println(m.add(1, 2,3));
		
	}

}
