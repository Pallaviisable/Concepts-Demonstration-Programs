///////////////////////////////////////////////////////
//
//  File name :     Structure2.c
//  Description :   This program demonstrates a self-referential
//                  structure using a pointer to the same structure
//                  type. It prints the size of the structure.
//  Author :        Pallavi Sable
//  Date :          07/10/2025
//
///////////////////////////////////////////////////////
#include<stdio.h>

struct Demo
{
    int i;
    float f;
    struct Demo * ptr;   // A
};

int main()
{
    printf("%lu\n",sizeof(struct Demo));
    
    return 0;
}