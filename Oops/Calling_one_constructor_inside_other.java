package Oops;

public class Calling_one_constructor_inside_other
{
    // Default constructor
    Calling_one_constructor_inside_other()
    {
        // Print a message indicating that this is a default constructor
        System.out.println("This is a default Constructor...");
    }
    
    // Parameterized constructor
    Calling_one_constructor_inside_other(String s)
    {
        // Call the default constructor using "this()" before executing any other code
        this(); 
        // Print a message indicating that this is a parameterized constructor
        System.out.println("THIS IS PARAMETERIZED CONSTRUCTOR...");
    }
    
    // Main method to demonstrate constructor invocation
    public static void main(String[] args) 
    {
        // Create an instance of the class using the parameterized constructor
        Calling_one_constructor_inside_other con = new Calling_one_constructor_inside_other("Ashu");
    }
}
