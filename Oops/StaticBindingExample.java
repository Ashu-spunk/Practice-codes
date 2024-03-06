package Oops;

public class StaticBindingExample 
{

	public static void main(String[] args)
	{
		Animal animal =new Animal(); //Animal reference , Animal object.
		
		//static binding
		animal.sound();     //calls Animal's sound method...
		
		animal=new Dog();   //Animal reference ,Dog object
		animal.sound();       //still calls Animal's sound method because reference is of type Animal
		
		animal=new cat();   //Animal reference , cat object 
		animal.sound();     //still calls Animal's sound method because reference is of type Animal

	}

}


/* In this example, Animal is the superclass, and Dog and Cat are subclasses that override the sound method.
	However, even if you create Dog or Cat objects and assign them to an Animal reference variable, 
	the method invoked will still be determined by the reference type, which is Animal. 
	This is static binding or early binding in action.
*/





