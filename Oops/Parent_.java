package Oops; // Package declaration

public class Parent_
{ // Declaration of the Parent_ class

    private int x; // Private member variable x to store data

    // Method to set the value of x
    void setX(int x1)
    { // Method declaration with parameter x1
        x = x1; // Assigning the parameter value to the member variable x
    }

    // Method to display the value of x
    void displayX()
    { // Method declaration
        System.out.println(x); // Printing the value of x
    }

    // Declaration of a nested class Child inside the Parent_ class
    class Child extends Parent_
    { // Child class extends Parent_ class (inheritance)

        private int y; // Private member variable y to store data

        // Method to set the value of y
        void setY(int y1) 
        { // Method declaration with parameter y1
            y = y1; // Assigning the parameter value to the member variable y
        }

        // Method to display the value of y
        void displayY()
        { // Method declaration
            System.out.println(" , " + y); // Printing the value of y
        }
    }
}
