package Oops; 												// Package declaration
import java.util.Scanner;								 // Importing Scanner class for user input
public class Complex { 										// Class declaration

    // Instance variables to store real and imaginary parts
    private int real, imag;

    // Default constructor initializing real and imag to zero
    Complex()
    {
        real = imag = 0;
    }

    // Parameterized constructor to initialize real and imag with provided values
    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }
    
    // Method to get user input for real and imaginary parts
    void getdata()
    {
        Scanner sc = new Scanner(System.in); // Creating Scanner object
        System.out.println("Enter real: "); // Prompting user for real part
        real = sc.nextInt(); // Reading user input for real part
        System.out.println("Enter imaginary : "); // Prompting user for imaginary part
        imag = sc.nextInt(); // Reading user input for imaginary part
    }

    // Method to display complex number
    void display()
    {
        if (imag >=0)
            System.out.println(real + " + " + imag + "i"); // Displaying in the form "a + bi" if imaginary part is positive
        else
            System.out.println(real + "  " + imag + "i"); // Displaying in the form "a - bi" if imaginary part is negative or zero
    }

    // Method to add two complex numbers and return the result
    Complex sum(Complex c) 
    {
        Complex t = new Complex(); // Creating a new Complex object to store the result
        t.real = this.real + c.real; // Adding real parts
        t.imag = this.imag + c.imag; // Adding imaginary parts
        return t; // Returning the result
    }

    // Method to multiply two complex numbers and return the result
    Complex mult(Complex c)
    {
        Complex t = new Complex(); // Creating a new Complex object to store the result
        t.real = this.real * c.real - this.imag * c.imag; // Multiplying real parts and subtracting product of imaginary parts
        t.imag = this.real * c.imag + c.real * this.imag; // Multiplying cross terms and adding them
        return t; // Returning the result
    }
}
