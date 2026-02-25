///////////////////////////////////////////////////////
//
//  File name :     ExceptionDemo9.java
//  Description :   This program demonstrates try catch
//                  finally block
//  Author :        Pallavi Sable
//  Date :          08/10/2025
//
///////////////////////////////////////////////////////

import java.util.*;
class ExceptionDemo9
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int Arr[] = {10,20,30,40,50};
        int iIndex = 0;
        int iData = 0;
    
        System.out.println("Enter the index Number :");
        iIndex = sobj.nextInt();
    
        
        iData = Arr[iIndex]; //Exception prone code

        System.out.println("Element a that Index is : " +iData);
    }
}