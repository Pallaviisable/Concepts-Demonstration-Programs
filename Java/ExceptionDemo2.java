///////////////////////////////////////////////////////
//
//  File name :     ExceptionDemo2.java
//  Description :   This program demonstrates Exception
//                  Handling in java and also shows typecasting
//  Author :        Pallavi Sable
//  Date :          08/10/2025
//
///////////////////////////////////////////////////////

import java.util.*;
class ExceptionDemo2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iNo1 = 0;
        int iNo2 = 0;
        float fAns = 0;

        System.out.println("Enter First Number :");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number :");
        iNo2 = sobj.nextInt();


        fAns = (float)iNo1/(float)iNo2; //integer is divided by integer hence answer would be integer
                                        // but to have actual answer that is in point hence we typecast
                                        // the operand.

        System.out.println("Division is :" +fAns);
    }
}