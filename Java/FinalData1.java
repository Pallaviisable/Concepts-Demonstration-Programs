////////////////////////////////////////////////////////////
//
//  File Name  : FinalData1.java
//  Description: This program demonstrates the use of `final` 
//               variables in Java. A final data member can be 
//               assigned once and cannot be modified afterward.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

class Demo
{
    public int i;                  // Regular instance variable
    final public int j;            // Final instance variable (constant)

    public Demo()
    {
        this.i = 11;               // Initialize regular variable
        this.j = 21;               // Initialize final variable
    }
}

class FinalData1
{
    public static void main(String[] args)
    {
        Demo dobj = new Demo();

        System.out.println(dobj.i);   // Output: 11
        System.out.println(dobj.j);   // Output: 21

        dobj.i++;                     // Allowed: i is not final
        // dobj.j++;                  // ERROR: Cannot modify final variable j
    }
}