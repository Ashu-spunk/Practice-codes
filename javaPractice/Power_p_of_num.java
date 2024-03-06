package javaPractice;

import java.util.Scanner;

public class Power_p_of_num
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int Result = 1;
		int num = 0;
		int p=1;
		System.out.println("Enter the value of Number and its power you want to calculate : ");
		num=sc.nextInt();
		p=sc.nextInt();
		
		while(p>0)
		{
			Result=Result*num;
			p--;
		}
		System.out.println("The RESULT is : "+Result);
	}

}
