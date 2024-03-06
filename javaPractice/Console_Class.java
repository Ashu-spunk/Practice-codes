package javaPractice; 	
import java.io.Console;

public class Console_Class {
    public static void main(String[] args) {
        String uname=" ";
        char[] ch;
        Console console = System.console();
        
        
        

        System.out.println("Enter Username: ");
        uname = console.readLine();

        System.out.println("Enter your password: ");
        ch = console.readPassword(); // Reads password without echoing characters

        // Convert char array to String
        String pass = new String(ch);

        System.out.println("Your name & password are: " + uname + " " + pass);
    }
}
