///////////////////////////////////////////////////////
//
//  File name :     QualifierConst.c
//  Description :   This program demonstrates the use of the 'const' keyword in C.
//                  It shows that a constant variable cannot be modified after initialization,
//                  while a normal variable can be incremented or changed.
//  Author :        Pallavi Sable
//  Date :          05/10/2025
//
///////////////////////////////////////////////////////
#include<stdio.h>

int main()
{
    int iNo1 = 10;
    const int iNo2 = 20;

    // Below lines generates errors

    iNo1++;     // iNo1 = iNo1 + 1;
    iNo2++;     // iNo2 = iNo2 + 1;             Error
    iNo2 = 30;                              //  Error

    return 0;
}