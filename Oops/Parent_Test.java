package Oops; // Package declaration

import Oops.Parent_.Child; // Importing the Child class from the Oops.Parent_ package

public class Parent_Test
{ // Class declaration

    public static void main(String[] args)
    { // Main method
        Parent_ p = new Parent_(); // Creating an instance of the Parent_ class
        
        // Creating an instance of the nested Child class using the instance of Parent_
        Child c1 = p.new Child();
        
        //c1.x=5;											//error as x is private
        // Setting values for the Child object using setter methods
        c1.setX(5);
        c1.setY(10);
        
        // Displaying the value of x using the displayX() method
        c1.displayX();
        
        // Displaying the value of y using the displayY() method
        c1.displayY();
    }
}
