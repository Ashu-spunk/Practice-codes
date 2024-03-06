package javaPractice;

import java.util.Scanner;

public class Leap_Year
{

	public static void main(String[] args)
	{
		int num;
		int year;
		System.out.println("This is a program for checking Leap year!!!");
		System.out.println("Entered the year you want to check if it is Leap year or not");
		
		Scanner sc=new Scanner (System.in);
		num=sc.nextInt();
		
		if(num%400==0)
		{
			System.out.println("Entered year is a Leap Century !!!");
		}
		else if(num%4==0)
		{
			System.out.println("Entered year is a Leap year !!!");
		}
		else 
		{
			System.out.println("Entered year is a normal year NOT Leap ");
		}
	}

}
