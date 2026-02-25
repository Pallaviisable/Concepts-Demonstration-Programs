////////////////////////////////////////////////////////////
//
//  File Name  : AbstractDemo2.java
//  Description: This program demonstrates abstract classes 
//               and inheritance in Java. It shows that a 
//               derived class must implement all abstract 
//               methods; otherwise, it also becomes abstract 
//               and cannot be instantiated.
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

class Derived extends Base                              // ERROR: Must implement Substraction()
{
    // No implementation of abstract method → Derived remains abstract
}

class AbstractDemo2
{
    public static void main(String[] args)
    {
        // Base bp = new Base();                      // ERROR: Cannot instantiate abstract class
        // Derived dp = new Derived();               // ERROR: Cannot instantiate Derived without implementing Substraction()

        System.out.println("Cannot instantiate abstract classes or unimplemented derived classes.");
    }
}