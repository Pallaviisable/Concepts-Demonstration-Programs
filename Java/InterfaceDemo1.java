////////////////////////////////////////////////////////////
//
//  File Name  : InterfaceDemo1.java
//  Description: This program demonstrates the rules of 
//               Java interfaces. The class `Hello` attempts 
//               to implement interface `Demo` but does not 
//               provide a definition for the abstract method, 
//               causing a compile-time error.
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
    // ERROR: Must override Display() method of Demo interface
    // If not overridden, class Hello must be declared abstract
}

public class InterfaceDemo1
{
    public static void main(String[] args)
    {
        // Cannot create object of Hello because Display() is not implemented
        // Hello hobj = new Hello();  // ERROR
    }
}