package javaPractice;

import java.util.Scanner;

public class Reverse_Number
{

	public static void main(String[] args) 
	{
		int temp=0;
		int rem;
		System.out.println("Enter a number to get Reverse of that number:");
		Scanner p=new Scanner(System.in);
		int num=p.nextInt();
		if(num<0) 
		{
			System.out.println("Please enter a valid Positive number !!!");
		}
		else
		{
			while(num!=0) 
			{
				rem=(num%10);
				temp=temp*10+rem;
				num =num/10;
			}
			System.out.println("Reverse of the entered number is :");
			System.out.println(temp);
		}
	}

}
