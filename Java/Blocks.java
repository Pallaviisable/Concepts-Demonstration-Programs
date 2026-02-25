////////////////////////////////////////////////////////////
//
//  File Name  : Blocks.java
//  Description: This program demonstrates the use of static 
//               blocks, instance variables, and static 
//               variables in Java. It shows the order of 
//               execution of static blocks, constructors, 
//               and main method.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

class Demo
{
    public int i;                   // Instance variable
    static public int j;            // Class (static) variable

    static                             // Static block executed once when class is loaded
    {
        System.out.println("Inside static block");
        j = 21;
    }

    public Demo()                      // Constructor executed for each object creation
    {
        System.out.println("Inside constructor");
        this.i = 11;
    }
}

class Blocks
{
    public static void main(String[] args)
    {
        System.out.println("Inside main");  // Main method starts execution

        Demo dobj1 = new Demo();           // Creates first object, constructor called
        Demo dobj2 = new Demo();           // Creates second object, constructor called
        Demo dobj3 = new Demo();           // Creates third object, constructor called
    }
}