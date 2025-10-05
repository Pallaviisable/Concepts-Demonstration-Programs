///////////////////////////////////////////////////////
//
//  File name :     DataTypeSizeAddress.c
//  Description :   This program demonstrates the use of sizeof to
//                  display the memory size of different data types,
//                  and also prints their memory addresses using the
//                  address-of (&) operator.
//  Author :        Pallavi Sable
//  Date :          05/10/2025
//
///////////////////////////////////////////////////////
#include<stdio.h>

int iMarks = 89;

int main()
{
    char cValue = 'S';
    int iValue = 11;
    float fValue = 90.78f;
    double dValue = 98.564323;

    printf("Size of character is : %lu\n",sizeof(cValue));
    printf("Size of integer is : %lu\n",sizeof(iValue));
    printf("Size of flaot is : %lu\n",sizeof(fValue));
    printf("Size of double is : %lu\n",sizeof(dValue));
    
    printf("Address of cValue is : %lu\n",&cValue);
    printf("Address of iValue is : %lu\n",&iValue);
    printf("Address of fValue is : %lu\n",&fValue);
    printf("Address of dValue is : %lu\n",&dValue);

    return 0;
}