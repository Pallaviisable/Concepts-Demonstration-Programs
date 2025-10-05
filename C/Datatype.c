///////////////////////////////////////////////////////
//
//  File name :     DataType.c
//  Description :   This program demonstrates the usage of different
//                  data types (char, int, float, double) and prints
//                  their values using appropriate format specifiers.
//  Author :        Pallavi Sable
//  Date :          05/10/2025
//
///////////////////////////////////////////////////////
#include<stdio.h>

int main()
{
    char cValue = 'S';
    int iValue = 11;
    float fValue = 90.78f;
    double dValue = 98.564323;

    printf("%c\n",cValue);
    printf("%d\n",iValue);
    printf("%f\n",fValue);
    printf("%lf\n",dValue);
    
    return 0;
}