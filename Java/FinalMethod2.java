////////////////////////////////////////////////////////////
//
//  File Name  : FinalMethod2.java
//  Description: This program demonstrates the use of `final` 
//               methods in Java. Final methods cannot be 
//               overridden by derived classes.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

class Base
{
    final public void fun()       // Final method: cannot be overridden
    {
    }

    final public void gun()       // Final method: cannot be overridden
    {
    }
}

class Derived extends Base
{
    public void run()             // Derived class method
    {
    }

    // public void gun()          // ERROR: Cannot override final method
    // {
    // }
}

class FinalMethod2
{
    public static void main(String[] args)
    {
        Derived dobj = new Derived();   // Create Derived object

        dobj.fun();  // Calls Base class final method
        dobj.gun();  // Calls Base class final method
        dobj.run();  // Calls Derived class method
    }
}