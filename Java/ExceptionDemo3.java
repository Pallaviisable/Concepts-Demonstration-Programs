///////////////////////////////////////////////////////
//
//  File name :     ExceptionDemo3.java
//  Description :   This program demonstrates Exception
//                  Handling in java 
//  Author :        Pallavi Sable
//  Date :          08/10/2025
//
///////////////////////////////////////////////////////

import java.util.*;
class ExceptionDemo3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iNo1 = 0;
        int iNo2 = 0;
        int iAns = 0;

        System.out.println("Enter First Number :");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number :");
        iNo2 = sobj.nextInt();


        iAns =iNo1/iNo2; 

        System.out.println("Division is :" +iAns);
    }
}