///////////////////////////////////////////////////////
//
//  File name :     ArrayDemo5.c
//  Description :   This program demonstrates that the array name
//                  cannot be incremented using the ++ operator,
//                  as it represents a constant base address.
//  Author :        Pallavi Sable
//  Date :          05/10/2025
//
///////////////////////////////////////////////////////
#include<stdio.h>

int main()
{
    double Arr[] = {10.0,20.0,30.0,40.0};

    printf("Size of Arr : %lu : \n",sizeof(Arr));   // 32

    Arr++;      // Error

    return 0;
}
