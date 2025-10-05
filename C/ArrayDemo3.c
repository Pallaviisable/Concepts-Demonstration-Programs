///////////////////////////////////////////////////////
//
//  File name :     ArrayDemo3.c
//  Description :   This program shows that the array name, 
//                  the address of the array,
//                  and the address of the first element all represent
//                  the same memory location.
//  Author :        Pallavi Sable
//  Date :          05/10/2025
//
///////////////////////////////////////////////////////
#include<stdio.h>

int main()
{
    int Arr[4] = {10,20,30,40};

    printf("Arr : %lu\n",Arr);                  // 100
    printf("&Arr : %lu\n",&Arr);                // 100
    printf("&(Arr[0]) : %lu\n",&(Arr[0]));      // 100

    return 0;
}
