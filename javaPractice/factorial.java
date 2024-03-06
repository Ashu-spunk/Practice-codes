package javaPractice;

import java.util.Scanner;

public class factorial
{

	public static void main(String[] args)
	{
		int fact=1;
		System.out.print("Enter a number to find its factorial:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		System.out.print("factorial of the entered number is:"+fact);

	}

}
