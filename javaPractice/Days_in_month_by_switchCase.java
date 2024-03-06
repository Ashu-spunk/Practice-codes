package javaPractice;

import java.util.Scanner;

public class Days_in_month_by_switchCase
{

	public static void main(String[] args)
	{
		int month;
		int days = 0;
		Scanner sc=new Scanner (System.in);
		System.out.println("please select month \n 1:January\n 2.February\n 3:March\n 4:April\n 5:May\n 6:June\n 7:July\n 8:August\n 9:September\n 10:October\n 11:November\n 12:December");
		System.out.println("Enter the month in digits:");
		month =sc.nextInt();
		
		switch (month) 
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		               days=31;
		               break;
		               
		case 2: days=28;
					break;
					
		case 4:
		case 6:
		case 9:
		case 11: days=30;
						break;
						
		default : days=0;
					break;
		}
		
					if  (days !=0) 
					{
						System.out.printf("Number of days in %d is %d ",month,days);
					}
					else
					{
						System.out.println("Please Enter a valid choice ...!");
					}
	}

}
