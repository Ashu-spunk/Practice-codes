package javaPractice;
import java.util.Scanner;

public class Next_NextLine_Diff
{
	public static void main(String[] args)
	{
		String Fullname,Actual_Fullname;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your Fullname please : ");
		Actual_Fullname=sc.nextLine();							//nextLine() will take FULL SENTENCE from user input...
		System.out.println(Actual_Fullname);                                //ie:- Ashutosh kumar singh
		
		System.out.println("Enter your Full name : ");
		Fullname=sc.next();										//next() will take only FIRST WORD from user input...
		System.out.println(Fullname);											//ie:-Ashutosh
		
	}

}
