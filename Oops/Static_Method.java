package Oops;
															//Static Method

/*Static methods belong to the class rather than any instance of the class.They can access static variables and
 *  other static methods directly.They are invoked using the class name, without needing an object of the class.
*/

public class Static_Method 
{
	//static method to calculate the square of a number
	static int square(int num)
	{
		return num*num;
	}
	
	public static void main(String[] args) 
	{
		int result =Static_Method.square(5);					//Class ke naam se call kr rhe hai square() method ko
		System.out.println("square is : "+result);
	}

}
