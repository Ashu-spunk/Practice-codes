package Oops;

public class Complex_Test
{

    public static void main(String[] args)
    {
        Complex C1, C2, C3, C4;

        // Creating instances of Complex class
        C1 = new Complex(); // Creating first complex number object
        C2 = new Complex(); // Creating second complex number object

        // Getting user input for complex numbers
        C1.getdata(); // Prompting user to input values for the first complex number
        C2.getdata(); // Prompting user to input values for the second complex number

        /* For testing purpose
        C1 = new Complex(5, 4);
        C2 = new Complex(7, 6);
        */

        // Calculating sum and displaying
        C3 = C1.sum(C2); // Calling sum method to compute sum of C1 and C2
        System.out.print("Sum is : ");
        C3.display(); // Displaying the sum

        // Calculating multiplication and displaying
        C4 = C1.mult(C2); // Calling mult method to compute multiplication of C1 and C2
        System.out.print("Multiplication is : ");
        C4.display(); // Displaying the multiplication

    }

  
    }


