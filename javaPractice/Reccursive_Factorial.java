package javaPractice;

import java.util.Scanner;

public class Reccursive_Factorial
{
	static int num=0;
	static int fact=1;
	static int factorial(int n)
	{
		if(n==0) 
		{
			return 1;			//Base case: factorial of 0 is 1
		}
		else
		{
			//Recursive case:calculating factorial by passing (n-1)
			fact = n*factorial(n-1);
			return fact;
		
		}
		
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter the no. for finding Factorial:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		factorial(num);
		System.out.println("factorial of "+num+" is : "+fact); 
	}

}
