////////////////////////////////////////////////////////////
//
//  File Name  : InterfaceDemo8.java
//  Description: This program demonstrates a Java interface 
//               containing a default method. Default methods 
//               allow interfaces to have concrete implementations 
//               starting from Java 8, while still supporting 
//               multiple inheritance.
//  Author     : Pallavi Sable
//  Date       : 06/10/2025
//
////////////////////////////////////////////////////////////

interface A
{
    int no = 11;       // Public, static, final

    void fun();        // Abstract method

    default void gun() // Default method with concrete implementation
    {
        System.out.println("Inside gun");
    }
}

class Demo implements A  // Implements interface A
{
    public void fun()    // Concrete implementation of abstract method
    {
        System.out.println("Inside fun");
    }
}

public class InterfaceDemo8
{
    public static void main(String[] args)
    {
        Demo dobj = new Demo();  // Create object of Demo
        dobj.fun();               // Call abstract method
        dobj.gun();               // Call default method from interface
    }
}