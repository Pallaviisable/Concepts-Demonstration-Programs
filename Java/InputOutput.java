////////////////////////////////////////////////////////////
//
//  File Name  : InputOutput.java
//  Description: This program demonstrates basic input and 
//               output in Java using the Scanner class. 
//               It reads two integers from the user and 
//               prints their sum.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

import java.util.Scanner;

class InputOutput
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);   // Scanner for input

        int No1 = 0, No2 = 0;
        int Ans = 0;

        System.out.println("Enter first number: ");
        No1 = sobj.nextInt();                    // Read first integer

        System.out.println("Enter second number: ");
        No2 = sobj.nextInt();                    // Read second integer

        Ans = No1 + No2;                         // Compute sum

        System.out.println("Addition is: " + Ans);   // Display result
    }
}