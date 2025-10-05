///////////////////////////////////////////////////////
//
//  File name :     ShortHand.c
//  Description :   This program demonstrates the difference between post-increment (i++)
//                  and pre-increment (++j) operators in C, showing how they affect
//                  the value of variables during assignment and output.
//  Author :        Pallavi Sable
//  Date :          05/10/2025
//
///////////////////////////////////////////////////////
#include<stdio.h>

int main()
{
    int i = 10, j = 10;
    int iAns = 0, jAns = 0;

    iAns = i++;
    jAns = ++j;

    printf("Value of i : %d\n",i);          // 11
    printf("Value of iAns : %d\n",iAns);    // 10

    printf("Value of j : %d\n",j);          // 11
    printf("Value of jAns : %d\n",jAns);    // 11

    return 0;
}