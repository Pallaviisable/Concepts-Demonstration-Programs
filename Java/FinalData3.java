////////////////////////////////////////////////////////////
//
//  File Name  : FinalData3.java
//  Description: This program demonstrates that a `final` 
//               variable in Java can only be assigned once. 
//               Attempting to reassign a final variable in the 
//               constructor after inline initialization causes an error.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

class Demo
{
    public int i = 11;            // Regular instance variable
    final public int j = 21;      // Final instance variable

    public Demo()
    {
        this.i = 12;              // Allowed: i is not final
        // this.j = 22;           // ERROR: Cannot reassign final variable j
    }
}

class FinalData3
{
    public static void main(String[] args)
    {
        Demo dobj = new Demo();

        System.out.println(dobj.i);   // Output: 12
        System.out.println(dobj.j);   // Output: 21

        dobj.i++;                     // Allowed: i is not final
        // dobj.j++;                  // ERROR: Cannot modify final variable j
    }
}