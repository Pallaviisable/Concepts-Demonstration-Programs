////////////////////////////////////////////////////////////
//
//  File Name  : InstanceInitializerDemo.java
//  Description: This program demonstrates static blocks, 
//               instance initializer blocks, constructors 
//               (default and parameterized), and the order 
//               of execution in Java.
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

    {                                  // Instance initializer block executed before every constructor
        System.out.println("Inside initializer block");
    }

    public Demo()                      // Default constructor
    {
        System.out.println("Inside constructor");
        this.i = 11;
    }

    public Demo(int a)                 // Parameterized constructor
    {
        System.out.println("Inside parametrised constructor");
        this.i = a;
    }
}

class BlocksX
{
    public static void main(String[] args)
    {
        System.out.println("Inside main");  // Main method starts execution

        Demo dobj1 = new Demo();           // Calls initializer block + default constructor
        Demo dobj2 = new Demo();           // Calls initializer block + default constructor
        Demo dobj3 = new Demo();           // Calls initializer block + default constructor
        Demo dobj4 = new Demo(11);         // Calls initializer block + parameterized constructor
    }
}