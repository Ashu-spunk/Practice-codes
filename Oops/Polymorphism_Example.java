package Oops;

public class Polymorphism_Example
{
	public static void main(String[] args)
	{
		Animal cat=new cat();						//upcasting
		Animal ranbir=new Ranbir();				//upcasting
		Animal dog=new Dog();						//upcasting
														
		dog.sound();										//calls dog class sound() method...
		cat.sound();										//calls cat class sound() method...
		ranbir.sound();										//calls Ranbir class sound() method...

	}

}

/* Animal is the superclass, and Dog and Cat are subclasses that
 *  override the sound method. When sound is called on dog and cat objects,
 *   Java determines the actual type of each object (Dog,Cat or Ranbir) at runtime 
 *   and dynamically binds the appropriate implementation of the sound method.
 *  This is dynamic binding or runtime polymorphism in action. 
 */
