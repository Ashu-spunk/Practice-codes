package Oops;								//CALL BY VALUE DEMO.

public class Call_by {
    // Method to add two numbers
    int Sum(int a, int b) {
        int z = a + b; // Calculating sum
        return z; // Returning the result
    }

    public static void main(String[] args) {
        Call_by c = new Call_by(); // Creating an instance of Call_by class
        int addition = c.Sum(1, 2); // Calling Sum method with arguments 1 and 2
        System.out.println("Addition is : " + addition); // Printing the result
    }
}

