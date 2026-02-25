////////////////////////////////////////////////////////////
//
//  File Name  : InterfaceDemo5.java
//  Description: This program demonstrates multiple interface 
//               inheritance where both interfaces declare the 
//               same method. The class `Demo` implements both 
//               interfaces and provides a single concrete 
//               definition of the method, resolving the diamond problem.
//  Author     : Pallavi Sable
//  Date       : 06/10/2025
//
////////////////////////////////////////////////////////////

interface A
{
    void fun();      // Abstract method
}

interface B
{
    void fun();      // Same abstract method as in A
}

class Demo implements A, B     // Multiple inheritance
{
    public void fun()           // Single implementation resolves ambiguity
    {
        System.out.println("Inside fun");
    }
}

public class InterfaceDemo5
{
    public static void main(String[] args)
    {
        Demo dobj = new Demo();  // Create object of Demo
        dobj.fun();               // Call the implemented method
    }
}