///////////////////////////////////////////////////////
//
//  File name :     PointerDemo1.c
//  Description :   This program demonstrates that the size of a 
//                  pointer variable is independent of the data type 
//                  it points to. It shows the size of int* and char* 
//                  pointers on the current system.
//  Author :        Pallavi Sable
//  Date :          07/10/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

int main()
{
    int iValue = 11;
    char cValue = 'M';

    int *iPtr = &iValue;
    char *cPtr = &cValue;

    printf("sizeof iptr : %lu\n",sizeof(iPtr));
    printf("sizeof cptr : %lu\n",sizeof(cPtr));
    


    return 0;
}