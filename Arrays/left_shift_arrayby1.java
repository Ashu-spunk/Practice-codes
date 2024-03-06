package Arrays;

public class left_shift_arrayby1
{

	public static void main(String[] args) 
	{
		int arr[]= {12,24,53,90,53,11};
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		System.out.println("left roated array is: ");
		for(int t:arr)
		{
			System.out.print(" "+t+" ");
		}
	}

}
