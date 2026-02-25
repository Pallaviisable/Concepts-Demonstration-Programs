///////////////////////////////////////////////////////
//
//  File name :     ExceptionDemo7.java
//  Description :   This program demonstrates You cant 
//                  write anything between try and catcg
//  Author :        Pallavi Sable
//  Date :          08/10/2025
//
///////////////////////////////////////////////////////

import java.util.*;
class ExceptionDemo7
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

        try
        {
            System.out.println("Inside try block");
            iAns =iNo1/iNo2; 
        }  
        System.out.println("Hello");//You cant write anything between try and catch
        catch(ArithmeticException aobj)//Specfic catch
        {
            System.out.println("Inside Catch block");
            System.out.println(aobj);
        }

        catch(Exception eobj) // Generic catch
        {
            System.out.println("Inside generic catch");   
        }  

        finally
        {
            System.out.println("inside finally block");
        }
        

        System.out.println("Division is :" +iAns);
    }
}