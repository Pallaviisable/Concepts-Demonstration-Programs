///////////////////////////////////////////////////////
//
//  File name :     StructureSizeX.c
//  Description :   This program demonstrates how structure 
//                  padding and alignment affect the size 
//                  of a structure in C.
//  Author :        Pallavi Sable
//  Date :          07/10/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

struct Demo
{
    int i;
    char ch1;
    float f;
    char ch2;
    int j;
};

int main()
{
    printf("Size of structure is : %lu\n",sizeof(struct Demo));
    
    return 0;
}