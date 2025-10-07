///////////////////////////////////////////////////////
//
//  File name :     PointerArithmetic1.c
//  Description :   This program demonstrates how pointers
//                  can be used to access elements of an array
//                  by storing the addresses of specific indices.
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

    printf("Data fetched by p is : %d\n",*p);   // 21
    printf("Data fetched by q is : %d\n",*q);   // 111
    
    return 0;
}