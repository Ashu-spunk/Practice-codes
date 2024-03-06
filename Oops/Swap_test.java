package Oops;

public class Swap_test
{
	static int x;
	static int y;

	public static void main(String[] args) 
	{
		//Created an instance of Swap_Call_by_Ref class
			Swap_Call_by_Ref ref=new Swap_Call_by_Ref();
			
			//Assigning values to x and y variables
			ref.x=1;
			ref.y=2;
			
			Swap_test st=new Swap_test();
			Swap_Call_by_Ref.swap(ref);
			System.out.println("After swap values of x and y are : "+x+" , "+y);
	}
	
}
