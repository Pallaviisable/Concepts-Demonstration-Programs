////////////////////////////////////////////////////////////
//
//  File Name  : FinalClass1.java
//  Description: This program demonstrates the use of the 
//               `final` keyword in Java with classes. 
//               A class declared as final cannot be extended.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

final class Base                   // Final class cannot be subclassed
{
}

class Derived extends Base          // ERROR: Cannot extend final class
{
}

class FinalClass1
{
    public static void main(String[] args)
    {
        // Cannot create Derived object if Base is final
        System.out.println("Final class cannot be extended in Java.");
    }
}