////////////////////////////////////////////////////////////
//
//  File Name  : InterfaceDemo2.java
//  Description: This program demonstrates that a class 
//               implementing an interface can remain abstract 
//               if it does not provide implementations for 
//               all abstract methods. Attempting to instantiate 
//               the abstract class causes a compile-time error.
//  Author     : Pallavi Sable
//  Date       : 06/10/2025
//
////////////////////////////////////////////////////////////

interface Demo
{
    int no = 11;       // Public, static, final by default
    void Display();    // Abstract method
}

abstract class Hello implements Demo
{
    // Abstract class can implement an interface without 
    // providing definitions for abstract methods
}

public class InterfaceDemo2
{
    public static void main(String[] args)
    {
        // ERROR: Cannot instantiate abstract class
        // Hello hobj = new Hello();
    }
}