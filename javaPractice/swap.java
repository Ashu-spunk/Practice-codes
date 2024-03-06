package javaPractice;

import java.util.Scanner;

public class swap 
{ 	
    static int num1,num2;
	static void swaping(int i,int j)								//formal parameter
																	//Call by value.
	{
		int temp = i;
		i=j;
		j=temp;
		System.out.printf("After swap number are : %d and %d ",i,j);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter the numbers....");
		Scanner sc=new Scanner (System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.printf("Entered numbers are %d and %d ",num1,num2);
		System.out.println(" ");
		swaping(num1,num2);						//Actual parameters.
		sc.close();								//close the Scanner.
		
	}

}
