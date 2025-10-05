///////////////////////////////////////////////////////
//
//  File name :     FunctionDemo.c
//  Description :   This program demonstrates a simple addition of two
//                  integer values by storing them in variables and
//                  printing the result using printf.
//  Author :        Pallavi Sable
//  Date :          05/10/2025
//
///////////////////////////////////////////////////////
#include<stdio.h>

int main()
{
    int Value1 = 0, Value2 = 0, Ans = 0;

    Value1 = 10;
    Value2 = 11;

    Ans = Value1 + Value2;

    printf("Addition is : %d\n",Ans);

    return 0;
}