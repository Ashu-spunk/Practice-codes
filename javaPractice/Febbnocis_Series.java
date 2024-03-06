package javaPractice;

import java.util.Scanner;

public class Febbnocis_Series {

	public static void main(String[] args)
	{
		int num=0;
		System.out.println("enter the count of febbnocis series you want to print:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int n3;
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2);
		for(int i=0;i<=num-2;i++)         //(-2)because two numbers i.e 0&1 are already printed above
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		

	}

}
