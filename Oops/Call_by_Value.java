package Oops;

public class Call_by_Value 
{
	void Swap(int x,int y)
	{
		int temp=x;				// Store the value of x in temp
		x=y;						// Assign the value of y to x
		y=temp;					// Assign the value of temp (originally x) to y

		// Print the swapped values
		System.out.println("Values in Swap method are : " +x +" , "+y);
	}
	
	public static void main(String[] args) 
	{
		int a=1;						// Declare and initialize variable a with value 1
		int b=2; 						// Declare and initialize variable b with value 2
		 // Create an instance of the Call_by_Reference class
		Call_by_Value  c=new Call_by_Value ();
		System.out.println("Values before swap are : "+a+" , "+b);      // Print the original values of a and b
		c.Swap(a, b); 												// Call the Swap method on the instance c, passing values of a and b
		System.out.println("Values after swap are : "+a+" , "+b);
	}

}

/*	This code won't actually swap the values of a and b because Java passes arguments by value, not by reference.
	Therefore, any changes made to the method parameters x and y inside the Swap method won't affect
	the original variables a and b outside the method.
*/

