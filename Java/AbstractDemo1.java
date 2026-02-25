////////////////////////////////////////////////////////////
//
//  File Name  : AbstractDemo1.java
//  Description: This program demonstrates the use of 
//               abstract classes in Java. It shows that 
//               an abstract class cannot be instantiated 
//               directly and can have both concrete and 
//               abstract methods.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

abstract class Base
{
    public int i;                                      // Data member i
    public int j;                                      // Data member j

    public int Addition(int a, int b)                  // Concrete method
    {
        return a + b;
    }

    abstract public int Substraction(int a, int b);    // Abstract method
}

class AbstractDemo1
{
    public static void main(String[] args)
    {
        // Base bp = new Base();                      // ERROR: Cannot instantiate abstract class

        System.out.println("Abstract classes cannot be instantiated directly.");
    }
}