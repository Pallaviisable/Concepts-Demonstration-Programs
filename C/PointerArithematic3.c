///////////////////////////////////////////////////////
//
//  File name :     PointerArithmetic3.c
//  Description :   This program demonstrates pointer arithmetic
//                  by adding an integer value to a pointer to
//                  access a different element in the array.
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

    //p + q;      // Not allowed
    p = p + 3;      // Allowed

    printf("Data pointed by p is : %d\n",*p);

    return 0;
}