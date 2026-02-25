////////////////////////////////////////////////////////////
//
//  File Name  : FinalMethod1.java
//  Description: This program demonstrates method definitions 
//               and overriding in Java. Shows how a derived 
//               class can override a base class method. 
//               Final methods (if used) cannot be overridden.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

class Base
{
    public void fun()       // Base class method definition
    {
    }

    public void gun()       // Base class method definition
    {
    }
}

class Derived extends Base
{
    public void run()       // Derived class method definition
    {
    }

    public void gun()       // Overriding Base's gun method
    {
    }
}

class FinalMethod1
{
    public static void main(String[] args)
    {
        Derived dobj = new Derived();   // Correct: create Derived object

        dobj.fun();  // Access base class method
        dobj.gun();  // Calls overridden method in Derived
        dobj.run();  // Access derived class method
    }
}