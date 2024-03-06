package Oops;

public class SingleTon
{
    // Static variable to hold the single instance of the class
    private static SingleTon obj = null;

    // Private constructor to prevent instantiation from outside the class
    private SingleTon()
    {
        // Print a message indicating that the constructor is called
        System.out.println("this is constructor");
    }

    // Static method to provide access to the single instance of the class
    static SingleTon Get_object() {
        // Check if the instance is null (i.e., if it hasn't been instantiated yet)
        if (obj == null)
            // If instance is null, create a new instance
            obj = new SingleTon();
        // Return the single instance of the class
        return obj;
    }

    // Main method to demonstrate the usage of the Singleton class
    public static void main(String[] args) {
        // Create instances of the Singleton class using the Get_object method
        SingleTon s1 = SingleTon.Get_object();
        SingleTon s2 = SingleTon.Get_object();

        // Check if both objects refer to the same instance
        System.out.println("Is both objects that we have created are same? : " + (s1 == s2));
    }
}
