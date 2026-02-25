////////////////////////////////////////////////////////////
//
//  File Name  : AbstractDemo3.java
//  Description: This program demonstrates abstract classes 
//               in Java with a concrete derived class. It 
//               shows how a derived class can implement 
//               abstract methods and how a base class 
//               reference can access overridden methods 
//               but not derived-only methods.
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

class Derived extends Base                             
{
    public int Substraction(int a, int b)              // Concrete implementation of abstract method
    {
        return a - b;
    }

    public int Multiplication(int a, int b)           // Derived-only method
    {
        return a * b;
    }
}

class AbstractDemo3
{
    public static void main(String[] args)
    {
        Base bp = new Derived();                      // Upcasting: Base reference points to Derived object
        int iRet = 0;

        iRet = bp.Addition(11, 10);               // Accessing Base concrete method
        System.out.println(iRet);                      // Output: 21

        iRet = bp.Substraction(11, 10);           // Accessing Derived implementation of abstract method
        System.out.println(iRet);                      // Output: 1

        // iRet = bp.Multiplication(11, 10);          // ERROR: Base reference cannot access Derived-only methods
    }
}