///////////////////////////////////////////////////////
//
//  File name :     ArrayDemo4.c
//  Description :   This program demonstrates the difference between
//                  using 'Arr + 1' and '(&Arr) + 1' by showing how
//                  pointer arithmetic behaves differently for the
//                  array name and the address of the entire array.
//  Author :        Pallavi Sable
//  Date :          05/10/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

int main()
{
    int Arr[5] = {10,20,30,40,50};

    printf("Size of Arr : %lu\n",sizeof(Arr));  // 20
    
    printf("Arr : %lu\n",Arr);              // 100
    printf("&Arr : %lu\n",&Arr);            // 100
    
    printf("Arr + 1 : %lu\n",Arr + 1);      // 104
    printf("(&Arr) + 1 : %lu\n",(&Arr) + 1);    // 120

    return 0;
}
