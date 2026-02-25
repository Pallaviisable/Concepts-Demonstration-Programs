////////////////////////////////////////////////////////////
//
//  File Name  : InterfaceDemo.java
//  Description: This program demonstrates the use of Java 
//               interfaces and multiple inheritance. The 
//               class `Demo` implements two interfaces 
//               `A` and `B`, providing definitions for 
//               their abstract methods.
//  Author     : Pallavi Sable
//  Date       : 06/10/2025
//
////////////////////////////////////////////////////////////

interface A
{
    void fun();     // Abstract method
}

interface B
{
    void gun();     // Abstract method
}

class Demo implements A, B     // Multiple inheritance
{
    public void fun()           // Implementation of A.fun()
    {
        System.out.println("Inside fun");
    }

    public void gun()           // Implementation of B.gun()
    {
        System.out.println("Inside gun");
    }
}

public class InterfaceDemo
{
    public static void main(String[] args)
    {
        Demo dobj = new Demo();  // Create object of Demo
        dobj.fun();               // Call method from interface A
        dobj.gun();               // Call method from interface B
    }
}