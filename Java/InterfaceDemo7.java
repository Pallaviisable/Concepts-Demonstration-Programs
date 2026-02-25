////////////////////////////////////////////////////////////
//
//  File Name  : InterfaceDemo7.java
//  Description: This program demonstrates multiple interface 
//               inheritance where both interfaces declare a 
//               variable with the same name. The implementing 
//               class resolves the ambiguity by explicitly 
//               specifying the interface name when accessing the variable.
//  Author     : Pallavi Sable
//  Date       : 06/10/2025
//
////////////////////////////////////////////////////////////

interface A
{
    int no = 11;       // Public, static, final
    void fun();        // Abstract method
}

interface B
{
    int no = 21;       // Public, static, final
    void fun();        // Abstract method
}

class Demo implements A, B     // Multiple inheritance
{
    public void fun()           // Single implementation of fun()
    {
        // Resolve ambiguity by specifying interface name
        System.out.println("Inside fun: A.no = " + A.no);
    }
}

public class InterfaceDemo7
{
    public static void main(String[] args)
    {
        Demo dobj = new Demo();  // Create object of Demo
        dobj.fun();               // Call implemented method
    }
}