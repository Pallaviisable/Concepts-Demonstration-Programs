///////////////////////////////////////////////////////
//
//  File name :     StructureSize.c
//  Description :   This program demonstrates how the compiler 
//                  calculates the size of a structure in C. 
//                  It also helps in understanding the concept 
//                  of structure padding and memory alignment.
//  Author :        Pallavi Sable
//  Date :          07/10/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

struct Demo
{
    int i;
    char ch;
    float f;
    int j;
};

int main()
{
    printf("Size of structure is : %lu\n",sizeof(struct Demo));
    
    return 0;
}