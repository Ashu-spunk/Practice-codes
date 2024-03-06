package Arrays;
import java.util.Scanner;

public class Array_Prac
{
	private int []a;
	private int n;
	
	//Method for getting Array data from user...
	void getdata()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter how many numbers you want to insert : ");
		n=sc.nextInt();
		
		a=new int [n];																//Array created by taking size from user
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println("Enter the"+i+" th element : ");
			 a[i]=sc.nextInt();
		 }
	
	}
	
	//Method for setting the variable size of data into an Array...
	void setdata(int ...x)
	{																	//setter
		a=x;
		n=x.length;
	}

	// Method created for displaying elements in the array...
	void display()
	{
		 System.out.println("Elements entered by you are : ");          //displaying elements by foreach loop. 
		for(int e:a)
		 {
			 System.out.print(e+" , ");
		 }
	}
	
	//Method for sorting the Array...
	void sort()
	{
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=a.length-1;j>i;j--)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	//Method for reversing the elements of the Array...
	void Reverse()
	{
		int temp=0;
		for(int i=0, j=n-1;i<j;i++,j--)								//"i" is running from start & "j" is running from behind.
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}

}
