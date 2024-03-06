package javaPractice;

import java.util.Scanner;

public class Palindrom_number
{

	public static void main(String[] args)
	{
		int temp;
		int rem,sum=0;
		int num=0;
		System.out.print("Enter a number to check for Palindrome: ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		temp=num;
		if(num>0) {
		while (num!=0) 
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(sum==temp) 
		{
			System.out.println("Entered number is a Palindrome");
		}
		else {
			System.out.println("Entered number is NOT Palindrome");
		}
		}
		else {
			System.out.println("Please enter a valid positive integer number.");
		}
	}

}
