package Oops;
public class Methods_in_Java 
{
	int x=1;
	//Constructor method
	Methods_in_Java()
	{
		System.out.println("Constuctor method is called when an object of class is created.");
	}
	
	//this is the method where Program execution begins
	public static void main(String[] args) 
	{
		staticMethod();
		Methods_in_Java obj=new Methods_in_Java();       //creating object obj for calling NonStatic methods
																		//in the class.
		obj.nonStaticMethod();
	}
	
	//Static Method
	static void staticMethod()
	{
		System.out.println("Static methods can be called directly without creating objects or with class name.");
		//System.out.println(x);							//can't use instance variable/member from static method we need
															// to make the variable/member static before using it.
	}

	//NON Static Method
	void nonStaticMethod() 
	{
		System.out.println("Non Static method must be called by creating object.");
	}
	
}
