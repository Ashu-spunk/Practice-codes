package toString;

//Defined a class called Person
public class Person {
 // Declare private attributes: name and age
 private String name;
 private int age;

 // Constructor to initialize name and age
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Override the toString() method to provide a custom string representation
 @Override
 public String toString() {
     // Return a string containing the person's name and age
     return "Person{name='" + name + "', age=" + age + '}';
 }

 // Main method to demonstrate the usage of the Person class
 public static void main(String[] args) {
     // Create a new Person object with name "John" and age 30
     Person person = new Person("John", 30);
     
     // Print the string representation of the person object
     // toString() method can be called explicitly, but it's not necessary
     System.out.println(person.toString());
     
     // When you print an object, toString() is implicitly called
     System.out.println(person);
 }
}
