////////////////////////////////////////////////////////////
//
//  File Name  : FinalData4.java
//  Description: This program demonstrates the use of `final` 
//               variables in Java initialized via a 
//               parameterized constructor. Final variables 
//               can only be assigned once and cannot be 
//               modified afterward.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

class Demo
{
    public int i;                  // Regular instance variable
    final public int j;            // Final instance variable

    public Demo(int a, int b)
    {
        this.i = a;                // Initialize regular variable
        this.j = b;                // Initialize final variable
    }
}

class FinalData4
{
    public static void main(String[] args)
    {
        Demo dobj = new Demo(11, 21);

        System.out.println(dobj.i);   // Output: 11
        System.out.println(dobj.j);   // Output: 21

        dobj.i++;                     // Allowed: i is not final
        // dobj.j++;                  // ERROR: Cannot modify final variable j
    }
}