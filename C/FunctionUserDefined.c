///////////////////////////////////////////////////////
//
//  File name :     FunctionUserDefined.c
//  Description :   This program demonstrates addition of two integers
//                  using a user-defined function and displays the result.
//  Author :        Pallavi Sable
//  Date :          05/10/2025
//
///////////////////////////////////////////////////////
#include<stdio.h>

int Addition(int iNo1, int iNo2)
{
    int iSum = 0;
    iSum = iNo1 + iNo2;
    return iSum;
}

int main()
{
    int iValue1 = 10, iValue2 = 11, iAns = 0;

    iAns = Addition(iValue1, iValue2);
    printf("Addition is : %d\n",iAns);

    return 0;
}