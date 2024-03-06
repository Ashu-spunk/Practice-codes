package Arrays;

import java.util.Scanner;

public class max_number
{

	public static void main(String[] args)
	{
		int max=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of Array: ");
		int a=sc.nextInt();
		int []arr=new int[a];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the element "+i+" : ");
			arr[i]=sc.nextInt();
		}
		for(int k=0;k<arr.length;k++)
		{
			if(arr[max]<arr[k]) {
				max=k;
			}
		}
		System.out.println("Largest number is : "+ arr[max]);

	}

}
