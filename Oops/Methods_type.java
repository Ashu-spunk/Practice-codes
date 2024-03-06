package Oops;															// Instance Method

/*	Instance methods are associated with instances (objects) of a class.They can access instance variables and other
 *  instance methods directly.They are invoked using an object of the class. 
*/	
public class Methods_type
{
	private int value;
	
	//Instance method to set the value
	int setValue(int newvalue)
	{
		return value=newvalue;
	}
	
	//Instance method to get the value
	int getValue()
	{
		System.out.print("The value is : ");
		return value;
	}
	
	public static void main(String[] args)
	{
		Methods_type m=new Methods_type();
		m.setValue(19);
		System.out.println(m.getValue());

	}

}
