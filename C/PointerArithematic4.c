///////////////////////////////////////////////////////
//
//  File name :     PointerArithmetic4.c
//  Description :   This program demonstrates subtraction of
//                  pointers and arithmetic operations on pointer
//                  variables to navigate through an array.
//  Author :        Pallavi Sable
//  Date :          06/10/2025
//
///////////////////////////////////////////////////////
#include<stdio.h>

int main()
{
    int Arr[] = {11,21,51,101,111};

    int *p = NULL;
    int *q = NULL;

    p = &(Arr[1]);
    q = &(Arr[4]);

    printf("Result of substraction is : %ld\n",q-p); // Allowed

    q = q - 2;                                       // Allowed
    
    printf("Data pointed by q is %d\n",*q);
 
    return 0;
}