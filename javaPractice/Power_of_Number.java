package javaPractice;

import java.util.Scanner;

public class Power_of_Number
{
	static int result=1;
	static int power(int n,int m) 
	{
		for(int i=0;i<m;i++) 
		{
			result=result*n;
		}
		return result;
	}
	public static void main(String[] args) 
	{
		int p,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		System.out.println("enter the power:");
		p=sc.nextInt();
		
		power(num,p);
		System.out.println("Result: "+result);
	}

}
