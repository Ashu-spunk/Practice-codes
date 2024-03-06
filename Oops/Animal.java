package Oops;

public class Animal 
{
	public void sound()													//es class me fetch or scratch method define nhi hai !!!
	{
		System.out.println("this prints the animal sounds...");
	}

}
 class Dog extends Animal
 {
	 @Override
	public void sound()
	{ 
		System.out.println("Bhaaw...Bhaaw...!!!");
	}
	 
	 public void fetch()
	 {
	        System.out.println("Fetching...");
	 }
	 
}
 class cat extends Animal
 {
	 @Override
		public void sound()
	 {
		 System.out.println("Meow...Meow...!!!");
	 }
	 
	  public void scratch()
	  {
	        System.out.println("Scratching...");
	  }
 }
 
 class Ranbir extends Animal
 {
	 @Override
		public void sound()
	 {
		 System.out.println("Papa...Papa...!!!");
	 }
 }