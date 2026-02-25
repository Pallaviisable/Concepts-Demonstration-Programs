////////////////////////////////////////////////////////////
//
//  File Name  : InterfaceDemo6.java
//  Description: This program demonstrates multiple interface 
//               inheritance where both interfaces declare a 
//               variable with the same name. Accessing `no` 
//               directly in the implementing class causes a 
//               compile-time error due to ambiguity.
//  Author     : Pallavi Sable
//  Date       : 06/10/2025
//
////////////////////////////////////////////////////////////

interface A
{
    int no = 11;       // Public, static, final
    void fun();        // Abstract method
}

interface B
{
    int no = 21;       // Public, static, final (same name as in A)
    void fun();        // Abstract method
}

class Demo implements A, B     // Multiple inheritance
{
    public void fun()           // Single implementation of fun()
    {
        // System.out.println("Inside fun" + no);  
        // ERROR: Ambiguous reference to 'no' (exists in both A and B)

        // Correct way: specify interface name
        System.out.println("Inside fun A.no = " + A.no);
        System.out.println("Inside fun B.no = " + B.no);
    }
}

public class InterfaceDemo6
{
    public static void main(String[] args)
    {
        Demo dobj = new Demo();  // Create object of Demo
        dobj.fun();               // Call implemented method
    }
}