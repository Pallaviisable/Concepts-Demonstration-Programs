///////////////////////////////////////////////////////
//
//  File name :     Modifier.c
//  Description :   This program demonstrates the use of the Modifiers 
//                  and displays the memory size of different integer data types
//                  Modifiers like short int, and long int.
//  Author :        Pallavi Sable
//  Date :          05/10/2025
//
///////////////////////////////////////////////////////
#include<stdio.h>

int main()
{
    int i = 10;
    short int j = 20;
    long int k = 30;

    printf("size of integer is : %lu\n",sizeof(i));         // 4
    printf("size of short integer is : %lu\n",sizeof(j));   // 2
    printf("size of long integer is : %lu\n",sizeof(k));    // 8

    return 0;
}