package javaPractice;
class EscapeSequenceDemo
{
	public static void main(String []args) {
		System.out.println("Roll \t 101 \n Age \t 21 \n course \t java \n");
		
		for(int i=0;i<5;i++) 
		{
			System.out.println(i+" ");
		}
		System.out.println("\b");
		System.out.println("\f");
		System.out.println("abc \r xy");
		System.out.println("5foot 6 inch--> "+ "5\'6\" ");
		System.out.println("c:\\t c\\b ; \\Ashu");
		System.out.println("abc \t\t xy");
	}
}