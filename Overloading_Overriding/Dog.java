package Overloading_Overriding;

//Child class extending Animal
class Dog extends Animal 
{
// Method overloading: same method name, different parameter list
public void makeSound()
{
   System.out.println("Dog barks");
}

// Method overriding: redefines the eat method of the parent class
@Override
public void eat() 
{
   System.out.println("Dog eats bones");
}

// Method overloading: same method name, different parameter list
public void fetch()
{
   System.out.println("Dog fetches ball");
}
}
