package javaPractice;

import java.util.Scanner;

public class average_of_numbers
{
	static int avg=0;
	static int temp;
	public static void main(String[] args)
	{
		System.out.println("for how many numbers you want to calculate the average :");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the element "+i+" : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Numbers entered by you are:-");
		for(int e:arr)
		{
			System.out.print(e+" ");
		}
		System.out.println(" ");
		for(int j=0;j<arr.length;j++)
		{
			temp=temp+arr[j];
		}
		avg=temp/arr.length;
		System.out.println("Average of the entered numbers is : "+avg);
	}

}
