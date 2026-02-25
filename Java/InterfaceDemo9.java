////////////////////////////////////////////////////////////
//
//  File Name  : InterfaceDemo9.java
//  Description: This program demonstrates Java interface features 
//               introduced in Java 8+, including private and default 
//               methods. Private methods can only be called by other 
//               interface methods and are not accessible by implementing classes.
//  Author     : Pallavi Sable
//  Date       : 06/10/2025
//
////////////////////////////////////////////////////////////

interface A
{
    int no = 11;       // Public, static, final

    void fun();        // Abstract method

    private void Display()  // Private method in interface (Java 8+)
    {
        System.out.println("Inside private Display");
    }

    default void gun()      // Default method with concrete implementation
    {
        System.out.println("Inside gun");
        Display();          // Private method called within interface
    }
}

class Demo implements A   // Implements interface A
{
    public void fun()      // Concrete implementation of abstract method
    {
        System.out.println("Inside fun");
    }
}

public class InterfaceDemo9
{
    public static void main(String[] args)
    {
        Demo dobj = new Demo();  // Create object of Demo
        dobj.fun();               // Call abstract method
        dobj.gun();               // Call default method which internally calls private method
        // dobj.Display();        // ERROR: private method not accessible outside interface
    }
}