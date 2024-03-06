package Oops;

public class Swap_Call_by_Ref
{
	int x=9,y=5;
	
	//Method to swap values...
	public static void swap(Swap_Call_by_Ref r)
	{
		int temp=r.x;
		r.x=r.y;
		r.y=temp;
	}


}
