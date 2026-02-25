////////////////////////////////////////////////////////////
//
//  File Name  : InterfaceDemo3.java
//  Description: This program demonstrates a class implementing 
//               a Java interface and providing a concrete 
//               definition for its abstract method. Also shows 
//               how interface variables are public, static, and final.
//  Author     : Pallavi Sable
//  Date       : 06/10/2025
//
////////////////////////////////////////////////////////////

interface Demo
{
    int no = 11;       // Public, static, final by default
    void Display();    // Abstract method
}

class Hello implements Demo
{
    public void Display()    // Concrete implementation
    {
        System.out.println("Inside Display");
    }
}

public class InterfaceDemo3
{
    public static void main(String[] args)
    {
        System.out.println(Demo.no);   // Access interface variable (static)

        // Demo.no = 12;               // ERROR: cannot modify final variable

        Hello hobj = new Hello();      // Create object of concrete class
        hobj.Display();                // Call implemented method
    }
}