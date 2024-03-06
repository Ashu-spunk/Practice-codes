package javaPractice;

import java.util.Scanner;

public class Tables_upto_entered_count
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter upto what number you want to print tables:");
		int n=sc.nextInt();
		for(int  t=1 ; t<=n ; t++)
		{
			for(int i=1 ; i<=10 ; i++) 
			{
				int a=t*i;
				System.out.println(t+"*"+i+"="+a);
			}	
				
				System.out.println(" ");
		}
			
	}
		
}	
		

