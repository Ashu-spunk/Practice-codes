package Oops;

public class MethodInvocationExample {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new cat();

        animal1.sound(); // Method invocation: Calls Dog's sound() method
        // animal1.fetch(); // Compilation error: fetch() ye method Animal class define nhi hai thats why error dega...

        animal2.sound(); // Method invocation: Calls Cat's sound() method
        // animal2.scratch(); // Compilation error: scratch()  ye method Animal class define nhi hai thats why error dega...

        // Downcasting to access subclass-specific methods
        
        Dog dog = (Dog) animal1;
        dog.fetch(); // Method invocation: Calls Dog's fetch method

        cat cat = (cat) animal2;
        cat.scratch(); // Method invocation: Calls Cat's scratch method
    }
}

/*	In the Animal class, there is a method makeSound which is overridden in the Dog and Cat subclasses.
	In the Dog class, there's an additional method fetch, and in the Cat class, there's an additional method scratch.
	In the main method, we create instances of Dog and Cat and assign them to Animal reference variables (animal1 and animal2).
	When we call makeSound method on animal1 and animal2,
	the JVM determines which version of the method to call based on the actual type of the object (Dog or Cat).
	We cannot directly call fetch method on animal1 or scratch method on animal2 because the reference type is Animal,
	and those methods are not defined in the Animal class.
	To access subclass-specific methods (fetch for Dog and scratch for Cat), 
	we perform downcasting to cast the Animal references back to their specific subclass types, allowing us to call those methods.
*/



