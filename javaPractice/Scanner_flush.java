package javaPractice;

import java.util.Scanner;

public class Scanner_flush 
{
	static String name;
	static int roll;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name : ");
		name=sc.next();
		System.out.println("Enter your rollno. :");
		roll=sc.nextInt();
		
		System.out.printf("your name & roll number is : "+name+" "+roll);
	}

}
