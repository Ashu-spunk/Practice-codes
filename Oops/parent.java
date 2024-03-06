package Oops;

public class parent
{
	//Overridden method
	public void m1()
	{
		System.out.println("Method of parent class m1()");
	}
	
	public void m2()
	{
		System.out.println("Method of parent class m2()");
	}

}

 class child extends parent
{
	 //Overriding method
	public void m1() 
	{
		System.out.println("this is method of child class m1()");
	}
}


