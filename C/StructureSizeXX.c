///////////////////////////////////////////////////////
//
//  File name :     StructureSizeXX.c
//  Description :   This program demonstrates how structure 
//                  padding and member arrangement affect 
//                  the overall memory size of a structure 
//                  in C programming.
//  Author :        Pallavi Sable
//  Date :          07/10/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

struct Demo
{
    int i;
    char ch1;
    char ch2;
    float f;
    int j;
};

int main()
{
    printf("Size of structure is : %lu\n",sizeof(struct Demo));
    
    return 0;
}