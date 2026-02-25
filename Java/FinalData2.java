////////////////////////////////////////////////////////////
//
//  File Name  : FinalData2.java
//  Description: This program demonstrates the use of `final` 
//               variables in Java with inline initialization. 
//               Final variables cannot be modified after being 
//               assigned a value.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

class Demo
{
    public int i = 11;            // Regular instance variable
    final public int j = 21;      // Final instance variable (constant)
}

class FinalData2
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