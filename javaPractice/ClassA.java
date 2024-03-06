package javaPractice;

public class ClassA 
{															//This method can accept zero or more arrguments.
	static int Sum(int ...a)
	{
		int s=0;
		for(int i=0;i<a.length;i++)
		{	
			s+=a[i];
		}
		return s;
	}

	public static void main(String[] args)
	{
		int arr[]= {10,29,48,85,98,32,41};
		
		System.out.println("Sum is : "+ Sum(arr));
		System.out.println("sum is : "+Sum());
		System.out.println("sum is : "+ Sum(5,39,41));
		System.out.println("sum is : "+ Sum (5,3));
		
	}
		//ye sb values di hai ye sb ARRAY bnkr jayengi AUTOMATICALY esi ko khte hai VAR ARGS.
}
