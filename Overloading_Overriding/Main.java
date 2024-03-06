package Overloading_Overriding;

public class Main 
{
    public static void main(String[] args)
    {
        // Creating objects
        Animal animal = new Animal();
        Dog dog = new Dog();
        
        // Method overloading
        animal.makeSound(); // Output: Animal makes a sound
        dog.makeSound();    // Output: Dog barks
        
        // Method overriding
        animal.eat(); // Output: Animal eats
        dog.eat();    // Output: Dog eats bones
        
        // Method overloading
        dog.fetch();  // Output: Dog fetches ball
    }
}

/*Method Overloading:

In the Dog class, we have two makeSound() methods with the same name but different parameter lists (method signatures). 
This is method overloading.Similarly, in the Dog class, we have a new method fetch() which is not present in the parent class Animal.
 This is also method overloading.Method overloading allows us to define multiple methods with the same name
 but different parameters or return types.
 
Method Overriding:

In the Dog class, we override the eat() method of the parent class Animal. The method signature remains the same, 
but the implementation is different.Method overriding allows a subclass to provide a specific implementation of a method
 that is already provided by its superclass.We use the @Override annotation to indicate that we are overriding a method
  from the superclass. This annotation helps in avoiding mistakes when overriding methods.
  
In summary, method overloading allows multiple methods with the same name in the same class, while method overriding
 allows a subclass to provide a specific implementation of a method that is already provided by its superclass.
*/