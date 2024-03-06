package Oops;

public class stringMethods
{
	public static void main(String[] args)
	{
		String s="Java Programming",t=" ",u="";
		System.out.println(s);
		
		//Find length of String
		int length=s.length();
		System.out.println("no. of characters in string s="+length);
		
		//Replace characters of String
		t=s.replace("Java","Python");
		System.out.println(s);
		System.out.println(t);

		//concatinating String with another String
		
		u=s.concat(" is Fun");
		System.out.println(s);
		System.out.println(u);
		
	}

}
