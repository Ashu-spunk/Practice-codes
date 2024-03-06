package Oops;

/*A static block is a block of code enclosed within {} that is preceded by the static keyword.
It is used to initialize static variables or to perform any static initialization tasks that need to be executed 
only once when the class is loaded into memory.Static blocks are executed when the class is loaded by
 the Java Virtual Machine (JVM), before the class is used or any objects of the class are created.
 */

public class Static_Block
{

	public static void main(String xyz[] ) 
	{
		System.out.println("Main method is executing...");
	}
	
	static
	{		//this is static block.
		System.out.println("Static block is executed before main method.");
	}
	
	static
	{			//this is the 2nd static block.
		System.out.println("This is the 2nd Static Block executing...");
	}
}
